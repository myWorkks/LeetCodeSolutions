package com.leetCode.linkedlist;

import java.util.ArrayList;
import java.util.List;

// Definition for singly-linked list.
//class ListNode {
//	int val;
//	ListNode next;
//
//	ListNode() {
//	}
//
//	ListNode(int val) {
//		this.val = val;
//	}
//
//	ListNode(int val, ListNode next) {
//		this.val = val;
//		this.next = next;
//	}
//}

class Solution {
	public ListNode mergeKLists(ListNode[] lists) {

		List<Integer> data = new ArrayList();
		// list1.next=list2;
		for (ListNode list : lists) {
			if (list != null) {
				while (list != null) {

					data.add(list.val);
					list = list.next;
				}
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

public class MergeKSortedList23 {

	public static void main(String[] args) {

	}

}
