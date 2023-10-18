package com.leetCode;
import java.util.Stack;

class Solution3233 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}



public class ValidParanthesis {

	public static void main(String[] args) {

		Solution3233 s = new Solution3233();
		;
		System.out.println(s.isValid("(([]){})"));
	}

}
