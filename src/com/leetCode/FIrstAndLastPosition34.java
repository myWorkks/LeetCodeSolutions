package com.leetCode;

import java.util.ArrayList;

class Solution34 {
	public int[] searchRange(int[] nums, int target) {

		int count = 0;
		int lastindex = 0;
		boolean elementpresent = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				elementpresent = true;
				count = i;
				;
				break;
			} else {
				elementpresent = false;

			}
		}
		if (!elementpresent) {
			count = -1;
		}
		elementpresent = true;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == target) {
				elementpresent = true;
				lastindex = i;
				;
				break;
			} else {
				elementpresent = false;
			}
		}
		if (!elementpresent)
			lastindex = -1;

		if (nums.length == 0) {
			count = -1;
			lastindex = -1;
		}
		return new int[] { count, lastindex };

		
	}
}

public class FIrstAndLastPosition34 {

	public static void main(String[] args) {
		Solution34 s = new Solution34();
		int[] b = s.searchRange(new int[] {}, 0);
		for (int i : b) {
			System.out.println(i);
		}
	}

}
//ArrayList<Integer> al = new ArrayList<Integer>();
//
//for (int i : nums) {
//	al.add(i);
//}
//return new int[] { al.indexOf(target), al.lastIndexOf(target) };
