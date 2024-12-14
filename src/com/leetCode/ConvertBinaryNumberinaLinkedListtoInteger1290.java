package com.leetCode;

import com.leetCode.Solution21.ListNode;

class Solution1290 {
	public int getDecimalValue(ListNode head) {
		String s = "";
		while (head != null) {
			s += head.val;
			head = head.next;
		}
		if (!s.isEmpty()) {
			return Integer.parseInt(s, 2);
		} else
			return -1;
	}
}

public class ConvertBinaryNumberinaLinkedListtoInteger1290 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
