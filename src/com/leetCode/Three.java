package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution15 {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		int a = Arrays.binarySearch(nums, 0);
		int negativeArray[] = null;
		if (a < 0) {
			negativeArray = Arrays.copyOf(nums, -a - 1);
		} else {
			negativeArray = Arrays.copyOf(nums, a);
		}
		for (int i : negativeArray) {
			System.out.println(i);
		}
		return null;
	}
}

public class Three {
	public static void main(String[] args) {
		Solution15 s = new Solution15();
		s.threeSum(new int[] { -1, -2, -3, -99, -5, 9, 2, 5, 7, -63,0 ,0, 1, 2, 3 });
	}
}
