package com.leetCode;

class Solution2108 {
	public String firstPalindrome(String[] words) {
		String palindrome = "";
		for (String s : words) {
			if (isPalindrome(s)) {
				palindrome = s;
				break;
			}
		}
		return palindrome;
	}

	private boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length()-1;
		boolean isPalindrome = true;
		while (left < right) {
			if (s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			} else {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
}

public class FindFirstPalindromicStringInTheArray2108 {

	public static void main(String[] args) {
		System.out.println(new Solution2108().firstPalindrome(new String[] {"def","ghi"}));

	}

}
