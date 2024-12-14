package com.leetCode;

/**
 * Definition for singly-linked list.
 *
 */
class Solution83 {
	static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		public ListNode(int val) {
			super();
			this.next = null;
			this.val = val;
		}

	};

	 public ListNode deleteDuplicates(ListNode head) {
			if(head==null)
				return null;
			if(head.next==null)
				return head;
			
			ListNode current =head;
			while(current.next!=null) {
				if(current.val==current.next.val) {
				current.next=deleteFirstNode(current.next);
				}else {
					current=current.next;
				}
			}
			
			return head;
		}
		public ListNode deleteFirstNode(ListNode head) {
			if(head==null)
				return null;
			if(head.next==null)
				return null;
			
			return head.next;
			
		}
	
};

public class RemoveDuplicatesfromSortedList83 {

	public static void main(String[] args) {
		com.leetCode.Solution83.ListNode head=new com.leetCode.Solution83.ListNode(1);
	
	}

}
