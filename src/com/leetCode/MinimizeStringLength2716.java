package com.leetCode;

import java.util.Arrays;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

class Solution2716 {
	public int minimizedStringLength(String s) {
//		Set<Character> set = new TreeSet<Character>();
//		for (Character c : s.toCharArray()) {
//			set.add(c);
//		}
//		return set.size();
		int i = 0;
		int j = 1;
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		int count = s.length();
		while (i < ch.length && j < ch.length) {
			if (ch[i] == ch[j]) {
				count--;
			}
			i++;
			j++;
		}
		return count;
	}
}

public class MinimizeStringLength2716 {

	public static void main(String[] args) {
		Solution2716 s = new Solution2716();
		int a = s.minimizedStringLength("ipi");
		System.out.println(a);
	}

}
//Stack<Character> stack = new Stack<Character>();
//for (Character c : s.toCharArray()) {
//	if (stack.empty()) {
//		stack.push(c);
//	} else {
//		if (!stack.peek().equals(c)) {
//			stack.push(c);
//		}
//	}
//}
//return stack.size();
