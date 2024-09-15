package com.leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution1 {
	public List<List<Integer>> threeSum(int[] nums) {
		return null;
	}
}

public class ThreeSumQ15 {

	public static void main(String[] args) {

		Solution1 s = new Solution1();

		System.out.println(s.threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));

		// [[-1,-1,2],[-1,0,1]]
	}
	// List<Integer> indices = new ArrayList<Integer>();
//	List<List<Integer>> listOfindeces = new ArrayList<List<Integer>>();
//	for (int i = 0; i < nums.length; i++) {
//		for (int j = i + 1; j < nums.length; j++) {
//			for (int k = j + 1; k < nums.length; k++) {
//
//				if (i != j && j != k && k != i && (nums[i] + nums[j] + nums[k] == 0)) {
//
//					indices.add(nums[i]);
//					indices.add(nums[j]);
//					indices.add(nums[k]);
//
//					indices.sort((x, y) -> x.compareTo(y));
//
//					listOfindeces.add(indices);
//					indices = new ArrayList<Integer>();
//
//				}
//			}
//		}
//	}
//	Set<List<Integer>> s = (listOfindeces.stream().collect(Collectors.toSet()));
//
//	return new ArrayList<List<Integer>>(s);
}
