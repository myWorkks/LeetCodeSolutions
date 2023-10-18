package com.leetCode;

class Solution151 {
	public String reverseWords(String s) {
		if (!s.equals(" ")) {
			String ss[] = s.trim().split(" ");
			String finalString = "";
			for (int i = ss.length - 1; i >= 0; i--) {
				if(!ss[i].equals(""))
				finalString += ss[i] + " ";
			}
			return finalString.trim();
		}
		throw new RuntimeException();
	}
}

public class ReverseWordInAString151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
