package com.leetCode;

class Solution219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		boolean b = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && i - j <= k) {
					b = true;
					// break;
				}
			}
			if (b)
				break;
		}
		return b;
	}
}

public class ContainsDuplicate219 {

	public static void main(String[] args) {
		Solution219 s = new Solution219();
		System.out.println(s.containsNearbyDuplicate(new int[] { 1, 2, 3, 1, 2, 3 }, 2));
	}

}
