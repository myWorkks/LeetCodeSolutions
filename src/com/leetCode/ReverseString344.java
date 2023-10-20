package com.leetCode;

class Solution344 {
	public void reverseString(char[] s) {
		int i=0;
		int j=s.length-1;
		while(i<j) {
			char temp;
			temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
		}
		
	}
}

public class ReverseString344 {

	public static void main(String[] args) {
		Solution344 s = new Solution344();
		s.reverseString(new char[] { 'h', 'e', 'i', 'o' });
	}

}
