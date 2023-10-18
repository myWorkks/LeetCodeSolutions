package com.leetCode;

class Solution27 {
	public int removeElement(int[] nums, int val) {
		int count = 0;

		for (int n : nums) {
			if (n != val)
				count++;

		}
		return count;
	}
}

public class RemoveElement27 {

	public static void main(String[] args) {
		Solution27 s = new Solution27();
		System.out.println(s.removeElement(new int[] { 0,1,2,2,3,0,4,2 }, 2));

	}

}
