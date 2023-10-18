package com.leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

class Solution139 {
	public boolean wordBreak(String s, List<String> wordDict) {
		List<String> list = new ArrayList<String>();

		for (String ss : wordDict) {

			if (s.contains(ss)) {

				list.add(s.substring(0, ss.length()));
				s = s.substring(ss.length());

			}
		}
		// wordDict = wordDict.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
		System.out.println(wordDict);
		return wordDict.equals(list);
	}
}

public class WordBreak139 {

	public static void main(String[] args) {
		Solution139 s = new Solution139();
		List<String> s1 = new ArrayList<String>();

//"cats","dog","sand","and","cat"
//		s1.add("apple");
//		s1.add("pen");
		// s1.add("apple");

//		s1.add("leet");
//		s1.add("code");
//		s1.add("cats");
//		s1.add("dog");
//		s1.add("sand");
//		s1.add("and");
//		s1.add("cat");
		// "a","b","bbb","bbbb"
		s1.add("a");
		s1.add("b");
		s1.add("bbb");
		s1.add("bbbb");

		System.out.println(s.wordBreak("bs", s1));
		;
	}

}
