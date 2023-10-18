package com.leetCode;

import java.util.ArrayList;
import java.util.List;

class Solution118 {
	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> elementsList = new ArrayList<List<Integer>>();
		for (int line = 1; line <= numRows; line++) {
			int current = 1;
			List<Integer> elements = new ArrayList<Integer>();
			for (int i = 1; i <= line; i++) {
				elements.add(current);
				current = current * (line - i) / i;
			}
			elementsList.add(elements);
		}
		return elementsList;
	}
}

public class PascalsTriangle118 {

	public static void main(String[] args) {
		Solution118 s = new Solution118();
		List<List<Integer>> l = s.generate(5);
		System.out.println(l);
	}

}
