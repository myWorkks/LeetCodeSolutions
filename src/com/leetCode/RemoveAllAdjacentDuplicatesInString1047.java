package com.leetCode;

import java.util.Stack;

class Solution1047 {
	public String removeDuplicates(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (Character c : s.toCharArray()) {
			if (stack.empty()) {
				stack.push(c);
			} else {
				if (stack.peek().equals(c)) {
					stack.pop();
				} else {
					stack.push(c);
				}
			}
		}
		String ss = "";
		while (!stack.empty()) {
			ss = stack.pop() + ss;
		}
		return ss;

	}
}

public class RemoveAllAdjacentDuplicatesInString1047 {

	public static void main(String[] args) {
		Solution1047 sol = new Solution1047();
		String s = sol.removeDuplicates("azxxzy");
		System.out.println(s);
	}

}
