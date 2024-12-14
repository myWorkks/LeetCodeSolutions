package com.leetCode;

import com.leetCode.Solution21.ListNode;

class Solution876 {
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null) {
        	++count;
        	temp=temp.next;
        }
        int middleIndex=(count/2) +1;
        System.out.println(middleIndex);
        
        while(middleIndex-1>0) {
        	head=head.next;
        	middleIndex--;
        }
        System.out.println(head);
        return head;
    }
}
public class MiddleoftheLinkedList876 {

	public static void main(String[] args) {
		Solution876 sol= new Solution876();
		sol.middleNode(new ListNode(1,new ListNode(2)));

	}

}
