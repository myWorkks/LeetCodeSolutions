package com.leetCode;

import java.util.Arrays;

class Solution35 {
	public int searchInsert(int[] nums, int target) {
		Arrays.sort(nums);
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (target <= nums[i]) {

				break;
			} else {
				index++;
			}
		}

		return index;
	}
}

public class InsertPosition35 {

	public static void main(String[] args) {
		Solution35 s = new Solution35();
		System.out.println(s.searchInsert(new int[] { 1, 3, 5, 6 }, 7));

	}

}
