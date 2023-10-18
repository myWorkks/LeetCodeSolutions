package com.leetCode;

import java.util.HashMap;
import java.util.Map;

class Solution168 {
	public String convertToTitle(int columnNumber) {
		int reminder = 0;
		boolean b = true;
		String title = "";
		Map<Integer, String> letters = new HashMap<Integer, String>();
		for (int i = 1; i <= 26; i++) {
			char letter = (char) ('A' + i - 1); // Convert the integer to a character
			letters.put(i, String.valueOf(letter)); // Add it to the map
		}
		// System.out.println(letters);
		if (columnNumber <= 26)
			return letters.get(columnNumber);
		else {

			while (columnNumber > 26) {
				reminder = columnNumber % 26;
				if (reminder == 0) {
					title = title + letters.get(26);
					columnNumber = columnNumber -1;
				} else {
					title = title + letters.get(reminder);
					
				}
				columnNumber = columnNumber / 26;
				if (columnNumber <= 26)
					title += letters.get(columnNumber);
			}

		}
		StringBuffer sb = new StringBuffer(title);
		return sb.reverse().toString();
	}

}

public class ExcelSheetColumnTitle168 {

	public static void main(String[] args) {
		Solution168 s = new Solution168();
		String ss = s.convertToTitle(943566);
		System.out.println(ss);
	}

}
