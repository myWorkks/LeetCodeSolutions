package com.leetCode;

import com.leetCode.Solution21.ListNode;

class Solution82 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		ListNode temp = new ListNode(-1000);
		temp.next = head;
		ListNode current = temp;

		while (current.next != null && current.next.next != null) {
		//	System.out.println("current " + current);
			if (current.next.val == current.next.next.val) {

				current.next = deleteNode(current.next, current.next.val);
			}

			else {
				current = current.next;
			}

		}

		return temp.next;
	}

	private ListNode deleteNode(ListNode head, int val) {
		if (head == null)
			return null;
		while (head != null && head.val == val) {
			head = head.next;
		}
		return head;
	}
}

public class RemoveDuplicatesfromSortedListII82 {

	public static void main(String[] args) {
		ListNode l = new ListNode(1,
				new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5)))))));
		Solution82 s = new Solution82();
		System.out.println(s.deleteDuplicates(l));

	}

}
