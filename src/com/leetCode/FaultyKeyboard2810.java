package com.leetCode;

class Solution2810 {
	static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public String finalString(String s) {
		if (!s.contains("i")) {
			return s;
		}
		int i = 0;
		String torev;
		String ff = "";
		while (i < s.length()) {

			if (s.charAt(i) == 'i') {
				torev = s.substring(0, i + 1);
				//System.out.println("torev " + torev);
				ff = reverse(torev);

				s = ff + s.substring(i + 1, s.length());

//				System.out.println(s);
//				System.out.println("string " + ff);
			}
			i++;
		}

		return s.replace("i", "");
	}
}

public class FaultyKeyboard2810 {

	public static void main(String[] args) {
		Solution2810 s = new Solution2810();
		String ff = s.finalString("goci");
		System.out.println(ff);
	}

}
