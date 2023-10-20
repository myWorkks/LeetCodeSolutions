package com.leetCode;

class Solution345 {
	static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
	}

	public String reverseVowels(String s) {
		char[] ss = s.toCharArray();

		int i = 0;
		int j = s.length() - 1;
		while (i < j) {

			char lefVowel = ss[i];
			char rightVowel = ss[j];
			while (!isVowel(lefVowel)&&i<j) {
				i++;
				lefVowel = ss[i];
			}
			while (!isVowel(rightVowel)&&i<j) {
				j--;
				rightVowel = ss[j];
			}
			if (isVowel(lefVowel) && isVowel(rightVowel)) {
				char temp;

				temp = ss[i];
				ss[i] = ss[j];
				ss[j] = temp;

				//System.out.println(ss);
			}
			i++;
			j--;
		}
		s="";
		for(int in=0;in<ss.length;in++)
			s+=ss[in];
		return s;
	}

}

public class ReverseVowelsofaString345 {

	public static void main(String[] args) {
		Solution345 s = new Solution345();
		String ss = s.reverseVowels("aA");
		System.out.println(ss);
	}

}
