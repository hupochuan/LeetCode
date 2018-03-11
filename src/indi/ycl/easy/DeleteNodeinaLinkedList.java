package indi.ycl.easy;

import indi.ycl.model.ListNode;

public class DeleteNodeinaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void deleteNode(ListNode node) {
		node.val=node.next.val;
		node.next=node.next.next;

	}

}
