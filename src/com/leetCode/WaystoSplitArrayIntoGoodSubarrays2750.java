package com.leetCode;

import java.util.HashMap;
import java.util.HashSet;

class Solution2750 {
	public int numberOfGoodSubarraySplits(int[] nums) {
		int count = 0;
		
		return count;
	}
}

public class WaystoSplitArrayIntoGoodSubarrays2750 {

	public static void main(String[] args) {
		Solution2750 s = new Solution2750();
		int count = s.numberOfGoodSubarraySplits(new int[] { 0, 1, 0 });
		System.out.println(count);
	}

}
//for (int i = 1; i <= nums.length; i++) {
//	int leftarr = 0;
//	for (int j = 0; j < i; j++) {
//		System.out.println("index " + j);
//		if (nums[j] == 1)
//			leftarr++;
//	}
//	int rightarr = 0;
//	for (int j = nums.length - 1; j >= i; j--) {
//		System.out.println("index " + j);
//		if (nums[j] == 1)
//			rightarr++;
//	}
//	if (leftarr == 1 && rightarr == 1) {
//		count++;
//	}
//}