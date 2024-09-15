package com.leetCode;

class Solution1672 {
	public int maximumWealth(int[][] accounts) {
		int maxWealth = Integer.MIN_VALUE;
		for (int[] a : accounts) {
			int count = 0;
			for (int b : a) {
				count += b;
			}
			if (count > maxWealth)
				maxWealth = count;

		}
		return maxWealth;
	}
}

public class RichestCustomerWealth1672 {

	public static void main(String[] args) {
		System.out.println(new Solution1672().maximumWealth(new int[][] { {1,5},{7,3},{3,5} }));
	}

}
