package com.leetCode;

class Solution66_2 {
	public int[] plusOne(int[] digits) {
		int index = -1;
		for (int i = digits.length - 1; i >=0; i--) {
			if (digits[i] != 9) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			digits = new int[digits.length + 1];
			for (int i = 0; i < digits.length; i++) {
				if (i == 0)
					digits[i] = 1;
				else
					digits[i] = 0;
			}
		} else {
			if (digits[index] == 0) {
				digits[index] = digits[index] + 1;
			} else {
				digits[index] = digits[index] + 1;
				for (int i = index + 1; i < digits.length; i++) {
					digits[i] = 0;
				}
			}
		}
		return digits;
	}

}

public class PlusOne66_2 {
	public static void main(String[] args) {
		Solution66_2 sol = new Solution66_2();
		for (int i : sol.plusOne(new int[] { 1,0,0 })) {
			System.out.print(i + " ");
		}
	}
}
