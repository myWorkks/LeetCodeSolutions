package com.leetCode;

class Solution7 {
	public String breakString(String s) {

		return null;
	}

	public int reverse(int x) {
		Integer i = x;
		String s = i.toString();
		if (s.charAt(0) == '-') {
			String s2 = s.substring(1);
			if (s2.length() > 5) {

			}
			s2 = new StringBuffer(s2).reverse().toString();
			int a=0;
			try {
				 a = Integer.parseInt(s2);
			} catch (NumberFormatException e) {
				System.out.println("cannot reverse the number as reversed number not in the range");
			}

			return a * -1;
		} else {
			String s2 = new StringBuffer(s).reverse().toString();
			int a=0;
			try {
				 a = Integer.parseInt(s2);
			} catch (NumberFormatException e) {
				System.out.println("cannot reverse the number as reversed number not in the range");
			}
			return a;
		}
	}
}

public class ReverseIntegerQ7 {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
		s.reverse(1534236469);

	}

}
