package com.leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution387 {
	public int firstUniqChar(String s) {
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (Character c : s.toCharArray()) {
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (charCount.get(s.charAt(i)) == 1)
				return i;
		}
		return -1;
	}
}

public class FirstUniqueCharacterinaString387 {

	public static void main(String[] args) {
		Solution387 s = new Solution387();
		int a = s.firstUniqChar("aabb");
		System.out.println(a);
	}

}
//HashSet<Character> hashSet = new HashSet<Character>();
//List<Character> list = new ArrayList<Character>();
//for (Character c : s.toCharArray()) {
//	hashSet.add(c);
//}
//System.out.println(hashSet);
//
//for (Character c : hashSet) {
//	int count = 0;
//	for (Character c1 : s.toCharArray()) {
//		if (c == c1) {
//			count++;
//		}
//	}
//	System.out.println(c + " count =" + count);
//	if (count == 1)
//		list.add(c);
//}
//if (list.isEmpty())
//	return -1;
//int leastindex = s.length() - 1;
//for (Character c : list) {
//	int a = s.indexOf(c);
//	if (a < leastindex)
//		leastindex = a;
//}
//return leastindex;