package com.leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution442 {
	public List<Integer> findDuplicates(int[] nums) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		List<Integer> duplicates = new ArrayList<Integer>();
		for (int a : nums) {
			if (hashSet.contains(a)) {
				duplicates.add(a);
			}
			hashSet.add(a);
		}

		return duplicates;
	}
}

public class FindAllDuplicatesInAnArray442 {
public static void main(String[] args) {
	Solution442 sol= new Solution442();
	System.out.println(sol.findDuplicates(new int[] {1}));
}
}
