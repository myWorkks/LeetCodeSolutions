package com.leetCode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution22 {
	List<String> br = new ArrayList<String>();
	public List<String> generateParenthesis(int n) {
		List<String> combinations = new ArrayList<String>();


		if (n == 1)
			combinations.add("()");
		else {

			int i = 0;
			int left = n - i;
			List<String> otherComb = generateCombinations(left, i);
			System.out.println(otherComb);
			combinations.addAll(otherComb);
		}
		return combinations;

	}

	private String generateBrackets(int n) {
		StringBuilder par = new StringBuilder();
		Stack<String> stack = new Stack();

		for (int i = 0; i < n; i++) {
			par.append('(');
			stack.add("(");
		}
		while (stack.size() > 0) {
			par.append(")");
			stack.pop();
		}
		// System.out.println(par);
		return par.toString();
	}

	private List<String> generateCombinations(int n, int single) {
		

		if (n >=0) {
			String b = generateBrackets(n);
			System.out.println("line 54:" + b);
			String b2 = generateRBrackets(single);
			System.out.println(" line 55" + b2);
			// br.add(b);
			System.out.println(b + b2);
			br.add(b + b2);
			List<String> comb = generateCombinations(n - 1, single + 1);
			System.out.println(comb);

			//br.addAll(comb);

		}
		System.out.println("gen :" + br);
		return br;
	}

	private String generateRBrackets(int single) {
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<single;i++)
			sb.append("()");
		return sb.toString();
	}
}

public class GenerateParentheses22 {

	public static void main(String[] args) {
		Solution22 sol = new Solution22();
		System.out.println(sol.generateParenthesis(3));
	}

}
