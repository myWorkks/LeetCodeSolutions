package com.leetCode;

import com.leetCode.Solution21.ListNode;

class Solution203 {
	public ListNode removeElements(ListNode head, int val) {
		if(head==null)
			return head;
		if(head.next==null && head.val==val)
			return null;
		ListNode current =head;
		while( current.next!=null) {
			if(current.next.val==val)
				current.next=current.next.next;
			else
				current=current.next;
			
		}
		if(head.val==val)
			head=head.next;
		return head;

	}
}

public class RemoveLinkedListElements203 {
	public static void main(String[] args) {

	}
}
