package indi.ycl.easy;

import indi.ycl.model.ListNode;

public class MergeTwoSortedLists_21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode head;
		if (l1.val > l2.val) {
			head = l2;
			l2 = l2.next;
		} else {
			head = l1;
			l1 = l1.next;
		}
		ListNode preNode=head;
		while (l1 != null && l2 != null) {
			if(l1.val<=l2.val){
				preNode.next=l1;
				preNode=l1;
				l1=l1.next;
			}else{
				preNode.next=l2;
				preNode=l2;
				l2=l2.next;
			}

		}
		if(l1==null){
			preNode.next=l2;
		}else if(l2==null){
			preNode.next=l1;
		}
		return preNode;

	}
    //代码太繁琐 有利用递归精简的
	public ListNode mergeTwoLists_A(ListNode l1, ListNode l2) {
		if(l1==null) return l2;
		if(l2==null) return l1;
		
		if(l1.val<l2.val){
			l1.next=mergeTwoLists(l1.next, l2);
			return l1;
		}else{
			l2.next=mergeTwoLists(l1, l2.next);
			return l2;
		}
	}

}
