package com.leetCode;

import java.util.HashSet;

class Solution287 {
	public int findDuplicate(int[] nums) {

		HashSet<Integer> hs = new HashSet<Integer>();
		int a1 = nums[0];
		for (int a : nums) {
			if (!hs.add(a)) {
				a1 = a;
				break;
			}
		}
		return a1;
	}
}

public class FindtheDuplicateNumber287 {

	public static void main(String[] args) {
		Solution287 s = new Solution287();
		int a = s.findDuplicate(new int[] { 1, 3, 4, 2, 2 });
		System.out.println(a);
	}

}
