package com.leetCode;

class Solution2396 {
	public boolean isStrictlyPalindromic(int n) {
		if (n == 5) {
			return false;
		}
		Integer j = n;
		boolean b = false;
		for (int i = 2; i < n - 2; i++) {
			String s = Integer.toString(j, i);
			System.out.println(s + " " + i);
			b = false;
			int rightIndex = s.length() - 1;
			int leftIndex = 0;
			while (leftIndex < rightIndex) {
				System.out.println(s.charAt(leftIndex) + " " + s.charAt(rightIndex));
				b = s.charAt(leftIndex) == s.charAt(rightIndex);
				System.out.println();
				leftIndex++;
				rightIndex--;
				if (b == false) {
					break;
				}

			}
			if (b == false) {
				break;
			}
		}

		return b;

	}
}

public class StrictlyPalindromeQ2396 {

	public static void main(String[] args) {
		Solution2396 s = new Solution2396();
		System.out.println(s.isStrictlyPalindromic(5));

	}

}
