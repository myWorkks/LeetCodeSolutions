package com.leetCode;

class Solution9 {
	public boolean isPalindrome(int x) {

		Integer a = x;
		String s = a.toString();
		if (s.length() == 1)
			return true;
		boolean b = false;
		int rightIndex = s.length() - 1;
		int leftIndex = 0;
		while (leftIndex < rightIndex) {
			System.out.println(s.charAt(leftIndex) + " " + s.charAt(rightIndex));
			b = s.charAt(leftIndex) == s.charAt(rightIndex);
			leftIndex++;

			rightIndex--;
			if (b == false) {
				break;
			}
			continue;

		}
		return b;

	}
}

public class Palandrome9 {

	public static void main(String[] args) {
		Solution9 s = new Solution9();
		// s.isPalindrome(121)
		System.out.println(s.isPalindrome(1000021));
	}

}
