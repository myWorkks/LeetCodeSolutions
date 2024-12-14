package com.leetCode;

class Solution21 {

	static class ListNode {

		int val;
		ListNode next;

		public ListNode(int value) {
			super();
			this.val = value;
			this.next = null;
		}

		public ListNode(int i, ListNode listNode) {
			this.val = i;
			this.next = listNode;
		}

		@Override
		public String toString() {
			return "ListNode [val=" + val + ", next=" + next + "]";
		}

	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		while (list1.next != null && list2.next != null) {

		}
		return list2;

	}

	

}

public class MergeTwoSortedList21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
