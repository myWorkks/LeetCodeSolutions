package com.leetCode;

import java.util.ArrayList;
import java.util.List;

class Solution844 {

	public boolean backspaceCompare(String s, String t) {
		List<Character> sList = new ArrayList<Character>();
		List<Character> tList = new ArrayList<Character>();
		if (s.equals(t))
			return true;
		else if (s.contains("#") || t.contains("#")) {
			for (int i = 0; i < s.toCharArray().length; i++) {
				if (s.charAt(i) != '#') {
					sList.add(s.charAt(i));
				} else {

					if (sList.size() > 0) {

						sList.remove(sList.size() - 1);
					} else
						continue;
				}

			}
			for (int i = 0; i < t.toCharArray().length; i++) {
				if (t.charAt(i) != '#') {
					tList.add(t.charAt(i));
				} else {
					if (tList.size() > 0) {
						tList.remove(tList.size() - 1);
					} else
						continue;
				}

			}
			return sList.equals(tList);
		} else
			return false;
	}
}

public class BackspaceStringCompare844 {

	public static void main(String[] args) {
		Solution844 s = new Solution844();
		boolean b = s.backspaceCompare("abcd", "bbcd");
		System.out.println(b);

	}

}
