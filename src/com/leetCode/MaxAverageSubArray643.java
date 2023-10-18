package com.leetCode;

class Solution643 {
	public double findMaxAverage(int[] nums, int k) {
		int left = 0;
		int right = 0;
		// double avg=0;
		int maxSum = 0;
		int preSum = 0;

		for (int i = 0; i < k; i++) {
			preSum += nums[i];
		}
		maxSum = preSum;
		while (right < nums.length) {
			if (right - left + 1 < k) {
				right++;
			} else if (right - left + 1 == k) {
				maxSum = Math.max(maxSum, preSum);
				if (right + 1 < nums.length) {

					preSum -= nums[left];
					preSum += nums[right + 1];
					left++;
					right++;

				} else
					break;

			}
		}
		return maxSum / (double) k;
	}
}

public class MaxAverageSubArray643 {

	public static void main(String[] args) {
		Solution643 s = new Solution643();
		double d = s.findMaxAverage(new int[] { -1 }, 1);
		System.out.println(d);
	}

}
