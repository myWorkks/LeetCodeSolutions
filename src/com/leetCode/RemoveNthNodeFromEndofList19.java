package com.leetCode;

import com.leetCode.Solution21.ListNode;

class Solution19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		int count = 0;
		ListNode temp = head;
		while (temp != null) {
			++count;
			temp = temp.next;
		}
		return deleteAtGivenPosition(head, count - n + 1);
	}

	private ListNode deleteAtGivenPosition(ListNode head, int n) {
		if (n == 1 && head != null)
			return head.next;
		ListNode prev = head;
		for (int i = 1; i < n; i++) {
			if (prev != null) {
				prev = prev.next;
			}
		}
		if (prev.next != null) {
			prev.next = prev.next.next;
			return prev;
		}
		return null;
	}
}

public class RemoveNthNodeFromEndofList19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
