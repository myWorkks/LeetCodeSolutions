package com.leetCode;

import com.leetCode.Solution21.ListNode;

class Solution206 {
	public ListNode reverseList(ListNode head) {
		if(head==null)
			return null;
		if(head.next==null)
			return head;
		ListNode last= null;
		//1 2 3 4 5
		while(head!=null) {
			if(last==null) {
				last= new ListNode(head.val);
			}else {
				ListNode temp= new ListNode(head.val);
				temp.next=last;
				last=temp;
			}
			head=head.next;
		}
		
		return last;

	}
}

public class ReverseLinkedList206 {

	public static void main(String[] args) {

	}

}
