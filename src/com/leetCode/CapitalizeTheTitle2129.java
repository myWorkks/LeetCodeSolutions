package com.leetCode;

class Solution2129 {
	public String capitalizeTitle(String title) {
		String[] s = title.trim().split(" ");
		String finalS = "";
		for (String s1 : s) {
			s1 = s1.toLowerCase();
			if (s1.length() > 2) {
				finalS = finalS + Character.toUpperCase(s1.charAt(0)) + s1.substring(1) + " ";
			} else {
				finalS = finalS + s1 + " ";

			}
		}
		return finalS.trim();
	}
}

public class CapitalizeTheTitle2129 {

	public static void main(String[] args) {
		Solution2129 s = new Solution2129();
		String ss = s.capitalizeTitle("capiTalIze tHe titLe");
		System.out.println(ss);
	}

}
