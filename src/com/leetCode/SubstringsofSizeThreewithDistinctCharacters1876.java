package com.leetCode;

import java.util.ArrayList;
import java.util.HashSet;

class Solution1876 {
	public int countGoodSubstrings(String s) {
		int start = 0;
		int end = 0;
		int count = 0;
		ArrayList<Character> hashSet = new ArrayList<>();
		while (end < s.length()) {
			if (end - start + 1 < 3) {
				end++;
			} else {
				System.out.println(start + "    " + end);
				String temp = s.substring(start, end + 1);
				System.out.println(temp);
				if (hashSet.isEmpty()) {
					for (Character c : temp.toCharArray()) {
						hashSet.add(c);
					}
					if (hashSet.get(0) != hashSet.get(1) && hashSet.get(1) != hashSet.get(2)
							&& hashSet.get(2) != hashSet.get(0))
						count++;

				} else {
					System.out.println(end);
					System.out.println(hashSet.get(0));
					System.out.println("before removing" + hashSet);
					hashSet.remove(hashSet.get(0));
					System.out.println("after removing " + hashSet);
					// end++;

					hashSet.add(temp.charAt(temp.length() - 1));
					if (hashSet.get(0) != hashSet.get(1) && hashSet.get(1) != hashSet.get(2)
							&& hashSet.get(2) != hashSet.get(0))
						count++;
					// start++;
					// end++;
				}
				start++;
				end++;
			}
		}

		return count;
	}
}

public class SubstringsofSizeThreewithDistinctCharacters1876 {

	public static void main(String[] args) {
		Solution1876 s = new Solution1876();
		int count = s.countGoodSubstrings("xyzzaz");
		System.out.println(count);
	}

}
