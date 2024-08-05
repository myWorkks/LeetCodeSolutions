package com.leetCode.hard.string;

import java.util.List;

class Solution30 {
	public List<Integer> findSubstring(String s, String[] words) {

		for (String word : words) {
			for (String word2 : words) {
				if (!word.equals(word2)) {
					String ss = word.concat(word2);
					System.out.println(ss);
				}
			}
		}
		return null;
	}
}

public class SubstringwithConcatenationofAllWords30 {

	public static void main(String[] args) {
		Solution30 sol = new Solution30();
		sol.findSubstring("", new String[] { "ab", "cd", "ef" });

	}

}
