package com.leetCode;

class Solution1684 {
	public int countConsistentStrings(String allowed, String[] words) {
		int count = 0;
		for (String word : words) {
			System.out.println(word);
			boolean flag = true;
			char[] ch = word.toCharArray();
			for (Character c : ch) {
				System.out.println(c);
				if (!allowed.contains(c.toString())) {
					flag = false;
					break;
				}
			}
			if (flag)
				count++;
		}
		return count;
	}
}

public class CountTheNumberOfConsistentStrings1684 {

	public static void main(String[] args) {
		System.out.println(
				new Solution1684().countConsistentStrings("ab", new String[] { "ad", "bd", "aaab", "baa", "badab" }));

	}

}
