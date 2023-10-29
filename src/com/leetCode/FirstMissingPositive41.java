package com.leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution41 {
	public int firstMissingPositive(int[] nums) {

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++)
			set.add(nums[i]);
		int shortestValue = 1;

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

public class FirstMissingPositive41 {

	public static void main(String[] args) {
		Solution41 s = new Solution41();
		int a = s.firstMissingPositive(new int[] { 7, 8, 9, 11, 12 });
		System.out.println(a);
	}

}
