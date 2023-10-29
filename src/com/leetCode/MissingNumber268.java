package com.leetCode;

import java.util.Arrays;
import java.util.HashSet;

class Solution268 {
	public int missingNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++)
			set.add(nums[i]);
		int shortestValue = 0;

		boolean b = true;
		while (b) {
			if (set.contains(shortestValue)) {
				shortestValue++;
			} else
				break;
		}
		return shortestValue;
	}
}

public class MissingNumber268 {

	public static void main(String[] args) {
		Solution268 s = new Solution268();
		int a = s.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 });
		System.out.println(a);
	}

}
