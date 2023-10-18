package com.leetCode;

class Solution58 {
	public int lengthOfLastWord(String s) {
		if (s.isEmpty() || s.equals(" "))
			throw new RuntimeException();

		String[] ss = s.trim().split(" ");
		return ss[ss.length - 1].length();
	}
}

public class LengthOfLastWord58 {

	public static void main(String[] args) {
		Solution58 s = new Solution58();
		;
		System.out.println(s.lengthOfLastWord("Hello World"));
	}

}
