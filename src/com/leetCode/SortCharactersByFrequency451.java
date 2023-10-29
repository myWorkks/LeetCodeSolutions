package com.leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Solution451 {
	String finalS = "";

	public String frequencySort(String s) {
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (Character c : s.toCharArray()) {
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}
		}
		// System.out.println(charCount);
		Set<Map.Entry<Character, Integer>> entry = charCount.entrySet();
		entry.stream().sorted((x, y) -> {
			Integer a = x.getValue();
			Integer b = y.getValue();
			return a.equals(b) ? (-y.getKey().compareTo(x.getKey())) : b.compareTo(a);
		}).forEach(x -> {
			//System.out.println(x);
			for (int i = 0; i < x.getValue(); i++) {
				finalS += x.getKey();
			}
		});
		//System.out.println("after stream    " + finalS);
		return finalS;
	}
}

public class SortCharactersByFrequency451 {

	public static void main(String[] args) {
		Solution451 s = new Solution451();
		s.frequencySort("tree");
	}

}
