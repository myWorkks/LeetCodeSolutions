package com.leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution2390 {
	public String removeStars(String s) {
		String ss="";
		Stack<Character> stack = new Stack<Character>();
		for (Character c : s.toCharArray()) {
			
			if (c != '*') {
				stack.push(c);
				
			} else {
				if (!stack.empty()) {
					stack.pop();
				}
			}
		}
		
		while(!stack.empty()) {
			ss=stack.pop()+ss;
		}
		return ss;
//	
	}
}

public class RemovingStarsFromaString2390 {

	public static void main(String[] args) {
		Solution2390 s = new Solution2390();
		String ss = s.removeStars("leet**cod*e");
				System.out.println(ss);
	}

}
//List<Character> sList = new ArrayList<>();
//String finals = "";
//
//if (s.contains("*")) {
//	System.out.println("inside if");
//	for (int i = 0; i < s.toCharArray().length; i++) {
//		if (s.charAt(i) != '*') {
//			sList.add(s.charAt(i));
//		} else {
//
//			if (sList.size() > 0) {
//
//				sList.remove(sList.size() - 1);
//			} else
//				continue;
//		}
//
//	}
//	for (Character c : sList)
//		finals += c;
//	return finals;
//} else
//	return s;
//}