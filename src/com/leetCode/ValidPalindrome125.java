package com.leetCode;

class Solution125 {
	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		String empty = "";
		char[] ch = s.toCharArray();
		for (Character c : ch) {
			if (Character.isLetter(c) || Character.isDigit(c)) {
				empty += c;
			}
		}
		System.out.println(empty);
		if (empty.isEmpty())
			return true;
		int l = empty.length();
		if (l == 1)
			return true;
		ch = empty.toCharArray();
		int leftIndex = 0;
		int rightIndex = l - 1;
		boolean b = false;
		while (leftIndex < rightIndex) {
			if (empty.charAt(leftIndex) == empty.charAt(rightIndex)) {
				b = true;
				leftIndex++;
				rightIndex--;

			} else {
				b = false;
				break;
			}

		}
		// System.out.println(b);
		return b;
	}
}

public class ValidPalindrome125 {

	public static void main(String[] args) {
		Solution125 s = new Solution125();
		System.out.println(s.isPalindrome("0P"));
		;
	}

}
