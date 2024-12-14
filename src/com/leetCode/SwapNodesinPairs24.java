package com.leetCode;

import com.leetCode.Solution21.ListNode;

class Solution24 {
	public ListNode swapPairs(ListNode head) {

		if (head == null)
			return null;
		if (head.next == null)
			return head;
		ListNode current = head;
		ListNode temp = null;
		ListNode t = null;
		ListNode tempHead = new ListNode(-1);
		ListNode cc = tempHead;
		// 1 2 3
		while (current != null) {
			if (current.next != null) {
				temp = current.next.next;// 3

				ListNode dummy2 = current.next;// 2 ->3
				dummy2.next = null;// 2 null

				ListNode dummy1 = current; // 1 2 null
				dummy1.next = null;// 1 null

				t = dummy1;// 1 null
				dummy1 = dummy2;// 2 null
				dummy2 = t;// 1 null

				dummy1.next = dummy2; // 2 1 null
				cc.next = dummy1;
//	System.out.println(cc);
				cc = cc.next.next;
				current = temp;// 3
			} else {
				cc.next = current;
				current=current.next;
			}

		}
		return tempHead.next;

	}
}

public class SwapNodesinPairs24 {

	public static void main(String[] args) {
		ListNode l = new ListNode(1, new ListNode(2, new ListNode(3)));

		Solution24 s = new Solution24();
		System.out.println(s.swapPairs(null));
		;
	}

}
