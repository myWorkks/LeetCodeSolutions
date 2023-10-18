package com.leetCode;

import java.util.Arrays;

class Solution242 {
	public boolean isAnagram(String s, String t) {
		if (s.equals(t))
			return true;
		if (s.length() != t.length())
			return false;

		char[] ch1 = s.toCharArray();
		Arrays.sort(ch1);
		char[] ch2 = t.toCharArray();
		Arrays.sort(ch2);
	return	Arrays.equals(ch1, ch2);
	}
}

public class ValidAnagram242 {

	public static void main(String[] args) {
Solution242 s= new Solution242();
System.out.println(s.isAnagram("rat", "car"));;
	}

}
