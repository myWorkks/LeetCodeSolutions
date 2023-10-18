package com.leetCode;

import java.util.Iterator;

class Solution20 {
	public boolean isValid(String s) {
		if (s.length() < 2)
			return false;
		if (s.length() % 2 != 0)
			return false;
		if (!s.matches("[\\(\\)\\{\\}\\[\\]]{2,}"))
			return false;
		char[] ch = s.toCharArray();
		boolean b = false;
		int j = 0;

		for (int i = 0; i < ch.length; i++) {
			j = i + 1;
			if (j < ch.length) {

				if ((ch[i] == '(' && ch[j] == ')')) {
					b = true;
					i++;
					continue;

				} else if (ch[i] == '[' && ch[j] == ']') {
					b = true;
					i++;
					continue;
				} else if (ch[i] == '{' && ch[j] == '}') {
					b = true;
					i++;
					continue;
				}

				else {
					b = false;
				}
				if (b == false) {
					j = s.length() - 1;
					while (i < j) {
						System.out.println(ch[i] + " " + i);
						System.out.println(ch[j] + " " + j);
						if (ch[i] == '[' && ch[j] == ']') {
							b = true;
							i++;
							j--;
							continue;
						} else if (ch[i] == '{' && ch[j] == '}') {
							b = true;
							i++;
							j--;
							continue;
						} else if (ch[i] == '(' && ch[j] == ')') {
							b = true;
							i++;
							j--;
							continue;
						} else {
							b = false;
							break;
						}
					}

				}
			}
			if (b == false) {
				break;

			}
			else {
				break;
			}

		}
		return b;

	}
}

public class ValidParenthesisQ20 {

	public static void main(String[] args) {
		Solution20 s = new Solution20();
		System.out.println(s.isValid("()[]"));
	}

}
