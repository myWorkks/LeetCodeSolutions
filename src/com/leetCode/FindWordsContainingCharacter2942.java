package com.leetCode;

import java.util.ArrayList;
import java.util.List;

class Solution2942 {
	public List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].contains(new String(new char[] { x }))) {
				list.add(i);
			}
		}
		return list;
	}
}

public class FindWordsContainingCharacter2942 {

	public static void main(String[] args) {
System.out.println(new Solution2942().findWordsContaining(new String[]{"leet","code"}, 'e'));
	}

}
