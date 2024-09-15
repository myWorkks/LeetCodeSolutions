package com.leetCode.linkedlist;

import java.util.ArrayList;
import java.util.List;

class ListNode {
	int val;
	ListNode next;

	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution21 {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null && list2 == null) {
			return list1;
		}
		List<Integer> data = new ArrayList();
		// list1.next=list2;
		if (list1 != null) {
			while (list1 != null) {

				data.add(list1.val);
				list1 = list1.next;
			}
		}
		if (list2 != null) {
			while (list2 != null) {

				data.add(list2.val);
				list2 = list2.next;
			}
		}
		// System.out.println(data);
		data = data.stream().sorted().toList();
		System.out.println(data);

		ListNode head = new ListNode();
		ListNode current = head;

		for (int i = data.size() - 1; i >= 0; i--) {
			if (i == 0) {

				current.val = data.get(i);

			} else {
				current.next = new ListNode();
				current.val = data.get(i);
				current = current.next;
			}
		}
		// head = head.next;
		return head;
	}
}

public class MergeTwoSortedLists21 {

	public static void main(String[] args) {
		Solution21 s = new Solution21();
		ListNode l1 = new ListNode();
		l1.val = 1;
		l1.next = new ListNode(2, new ListNode(4, null));
		ListNode l2 = new ListNode();
		l2.val = 1;
		l2.next = new ListNode(3, new ListNode(4, null));
		;
		ListNode n = s.mergeTwoLists(l1, l2);
		System.out.println(n);
		if (n != null) {
			while (n != null) {
				System.out.println(n.val);
				n = n.next;
			}
		}
	}

}
