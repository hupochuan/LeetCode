package indi.ycl.main;

import java.util.HashSet;
import java.util.Set;

import indi.ycl.model.ListNode;

public class RemoveDuplicatesfromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		Set<Integer> set = new HashSet<Integer>();
		ListNode preNode = head;
		ListNode curNode=head.next;
		set.add(head.val);
		while (curNode != null) {
			if (!set.add(curNode.val)) {
				preNode.next=curNode.next;
			}else{
				preNode=curNode;
			}
			curNode = curNode.next;
		}
		return head;

	}
	//上面的方法没有利用好已经排好序这一条件
	public ListNode deleteDuplicates_A(ListNode head) {
		if (head == null)
			return null;
		ListNode preNode = head;
		ListNode curNode=head.next;
	
		while (curNode != null) {
			if (preNode.val==curNode.val) {
				preNode.next=curNode.next;
			}else{
				preNode=curNode;
			}
			curNode = curNode.next;
		}
		return head;

	}
	
	//另外还可以利用递归的方法
	
	public ListNode deleteDuplicates_B(ListNode head) {
		if (head == null||head.next==null)
			return head;
		head.next=deleteDuplicates_B(head.next);
		return head.val==head.next.val?head.next:head;
	}

}
