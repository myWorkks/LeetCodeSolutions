package com.leetCode;

class Solution917 {

	static boolean isAlphabet(char ch) {
	//	System.out.println("checking char " + ch);
		return Character.isAlphabetic(ch);
	}

	public String reverseOnlyLetters(String s) {
		char[] ss = s.toCharArray();

		int i = 0;
		int j = s.length() - 1;
		while (i < j) {

			char leftalpha = ss[i];
			char rightalpha = ss[j];
			while (!isAlphabet(leftalpha) && i < j) {
				i++;
				leftalpha = ss[i];
			}
			while (!isAlphabet(rightalpha) && i < j) {
				j--;
				rightalpha = ss[j];
			}
			if (isAlphabet(leftalpha) && isAlphabet(rightalpha)) {
				char temp;

				temp = ss[i];
				ss[i] = ss[j];
				ss[j] = temp;

				// System.out.println(ss);
			}
			i++;
			j--;
		}
		StringBuilder sb = new StringBuilder();
		for (int in = 0; in < ss.length; in++)
			sb.append(ss[in]);
		return sb.toString();
	}

}

public class ReverseOnlyLetters917 {

	public static void main(String[] args) {
		Solution917 s = new Solution917();
		String rr = s.reverseOnlyLetters("a-bC-dEf-ghIj");
		System.out.println(rr);
	}

}
//"j-Ih-gfE-dCba"