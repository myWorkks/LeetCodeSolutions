package com.leetCode;

import java.util.ArrayList;
import java.util.List;

import com.leetCode.Solution21.ListNode;

class Solution234 {
	public boolean isPalindrome(ListNode head) {
		if (head == null)
			return false;
		if (head.next == null)
			return true;
		List<Integer> nums = new ArrayList<Integer>();
		while (head != null) {
			nums.add(head.val);
			head = head.next;

		}
		int left = 0;
		int right = nums.size() - 1;
		while (left < right) {
			if (nums.get(left) == nums.get(right)) {
				left++;
				right--;
			} else
				return false;
		}
		return true;
	}
}

public class PalindromeLinkedList234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
