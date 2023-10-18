package com.leetCode;

class Solution8 {
	public int myAtoi(String s) {
		s = s.trim();
		if (s.isEmpty()) {
			return 0;
		}
		String numberString = "";
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i]) || ch[i] == '-' || ch[i] == '+') {
				if (ch[i] == '-' && i == 0) {
					numberString += ch[i];
				} else if (ch[i] == '+' && i == 0) {
					numberString += ch[i];

				}
				else if (ch[i] == '-' && i != 0 || ch[i] == '+' && i != 0) {
					break;
				} 
				else if (Character.isDigit(ch[i])) {
					numberString += ch[i];
				}

			} else {
				break;
			}
		}

		System.out.println(numberString);
		System.out.println(numberString.length());
		if (numberString.isEmpty()) {
			return 0;
		}
		if (numberString.charAt(0) == '-') {
			String s2 = numberString.substring(1);

			int a = 0;
			if (s2.isEmpty()) {
				return 0;
			}
			try {
				a = Integer.parseInt(s2);
			} catch (NumberFormatException e) {
				a = Integer.MAX_VALUE+1;

			}

			return a * -1;
		} else {
			if(numberString.charAt(0)=='+') {
				String s2 = numberString.substring(1);

				if (s2.isEmpty()) {
					return 0;
				}
			}
			
			int a = 0;
			try {

				a = Integer.parseInt(numberString);
			} catch (NumberFormatException e) {
				a = Integer.MAX_VALUE;
			}
			return a;
		}

	}
}

public class StringToIntegerQ8 {

	public static void main(String[] args) {
		Solution8 s = new Solution8();
		// s.myAtoi("-91283472332");
		System.out.println(s.myAtoi("+-12"));
	}

}
