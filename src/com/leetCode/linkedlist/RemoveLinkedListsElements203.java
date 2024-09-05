package com.leetCode.linkedlist;

class Solution203 {
	public ListNode removeElements(ListNode head, int val) {

		ListNode newHead = head;

		while (newHead != null) {
			
				if (newHead.val == val) {
				newHead=removeNode(newHead);
				}
				newHead = newHead.next;
			}
			
		
//		if (head.val == val) {
//			return head.next;
//		}
		return head;
	}
	private ListNode removeNode(ListNode node) {
		return node.next;
	}
}

public class RemoveLinkedListsElements203 {

	public static void main(String[] args) {
		Solution203 sol = new Solution203();
		System.out.println(
				sol.removeElements(new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, null)))), 1));
	}

}
