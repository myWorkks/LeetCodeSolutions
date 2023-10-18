package com.leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution3 {
	public int lengthOfLongestSubstring(String s) {
		List<Character> l = new ArrayList<Character>();
		for (Character c : s.toCharArray()) {
			l.add(c);
		}
		String ss = l.stream().distinct().map(c -> c.toString()).collect(Collectors.joining(""));
		System.out.println("string " + ss);
		int left = 0;
		int right = ss.length()-1;
		String longstr = "";
		// System.out.println(ss.substring(left, right));
		;
		if (s.contains(ss)) {
			return ss.length();
		} else {
			while (left < right) {
				System.out.println("substring " + ss.substring(left, right));
				if (s.contains(ss.substring(left, right))) {
					System.out.println("inside if " + ss.substring(left, right));
					longstr += ss.substring(left, right);
					break;
				} else {
					left++;

				}
			}

			return longstr.length();
		}
	}
}

public class LongestSubstringWithoutRepeatingCharacters3 {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int a = s.lengthOfLongestSubstring("dvdf");//dvf
		System.out.println(a);
	}

}
