package com.leetCode;

class Solution162 {
	public int findPeakElement(int[] nums) {
		int peekIndex = 0;
		boolean b = true;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					peekIndex = i;
					b = true;
					break;
				} else
					peekIndex = j;
				b = false;
				break;
			}
			if (b)
				break;
		}
		System.out.println(peekIndex);
		return peekIndex;
	}
}

public class PeekElement162 {

	public static void main(String[] args) {
		Solution162 s = new Solution162();
		s.findPeakElement(new int[] { 1,2,1,3,5,6,4});

	}

}
