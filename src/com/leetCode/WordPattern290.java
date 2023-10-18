package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Solution290 {
	Map<Character, List<Integer>> mapOfCharacter(String pattern) {
		List<Character> charList = new ArrayList<Character>();
		for (Character a : pattern.toCharArray()) {
			charList.add(a);
		}
		Map<Character, List<Integer>> charWithIndecies = new TreeMap<Character, List<Integer>>((x, y) -> 1);

		List<Character> distinct = charList.stream().distinct().collect(Collectors.toList());

		for (Character d : distinct) {
			List<Integer> indices = new ArrayList<Integer>();
			for (int i = 0; i < charList.size(); i++) {
				if (charList.get(i) == d) {
					indices.add(i);
				}
			}
			charWithIndecies.put(d, indices);
		}
		System.out.println(charWithIndecies);
		return charWithIndecies;
	}

	Map<String, List<Integer>> mapOfString(String s) {
		List<String> charList = new ArrayList<String>();
		for (String a : s.split(" ")) {
			charList.add(a);
		}
		Map<String, List<Integer>> charWithIndecies = new TreeMap<String, List<Integer>>((x, y) -> 1);

		List<String> distinct = charList.stream().distinct().collect(Collectors.toList());

		for (String d : distinct) {
			List<Integer> indices = new ArrayList<Integer>();
			for (int i = 0; i < charList.size(); i++) {
				if (charList.get(i).equals(d)) {
					indices.add(i);
				}
			}
			charWithIndecies.put(d, indices);
		}
		System.out.println(charWithIndecies);
		return charWithIndecies;
	}

	public boolean wordPattern(String pattern, String s) {
		Map<Character, List<Integer>> charIn = mapOfCharacter(pattern);
		Map<String, List<Integer>> strIn = mapOfString(s);
		Collection<List<Integer>> ch1 = charIn.values();
		Collection<List<Integer>> sr1 = strIn.values();
		List<List<Integer>> ch = new ArrayList<List<Integer>>(ch1);
		List<List<Integer>> sr = new ArrayList<List<Integer>>(sr1);
		if(ch.size()!=(sr.size()))
			return false;
		boolean b = true;
		for (int i = 0; i < ch.size(); i++) {
			if (!ch.get(i).equals(sr.get(i))) {
				b = false;
				break;
			}

		}
		return b;

	}

}

public class WordPattern290 {

	public static void main(String[] args) {
		Solution290 sol = new Solution290();
		boolean b = sol.wordPattern("aaaa", "dog cat cat dog");
		System.out.println(b);
	}

}
