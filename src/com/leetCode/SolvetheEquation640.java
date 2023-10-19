package com.leetCode;

class Solution640 {
	public String solveEquation(String equation) {
		String subString = equation.substring(equation.indexOf('=') + 1);
		String leftSide = equation.substring(0, equation.indexOf('='));
		System.out.println(subString);
		System.out.println(leftSide);
		equation = leftSide + "-(" + subString + ")=0";
		System.out.println(equation);
		return "";
	}
}

public class SolvetheEquation640 {

	public static void main(String[] args) {
		Solution640 s = new Solution640();
		s.solveEquation("x+5-3+x=6+x-2");

	}

}
