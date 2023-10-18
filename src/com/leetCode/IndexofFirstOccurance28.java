package com.leetCode;

class Solution28 {
	public int strStr(String haystack, String needle) {

		if (haystack.contains(needle)) {
			return haystack.indexOf(needle);
		} else
			return -1;
	}
}

public class IndexofFirstOccurance28 {

	public static void main(String[] args) {
		Solution28 s = new Solution28();
		System.out.println(s.strStr("bharath", "reddy"));;

	}

}
