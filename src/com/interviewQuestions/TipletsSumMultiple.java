package com.interviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TipletsSumMultiple {
	public static void main(String[] args) {
		int a = countDistinctTripletsWithSumDivisibleByD(
				new int[] { 1,1,1,1 }, 2);

		System.out.println(a);
	}

	static int countDistinctTripletsWithSumDivisibleByD(int[] arr, int d) {

		int leftIndex = 0;
		int middleIndex = 1;
		int rightIndex = 2;
		int count = 0;
		while (rightIndex < arr.length) {

			if ((arr[leftIndex] + arr[middleIndex] + arr[rightIndex]) % d == 0) {
				System.out.println(arr[leftIndex] + arr[middleIndex] + arr[rightIndex]);
				count++;
			}
			leftIndex++;
			rightIndex++;
			middleIndex++;
		}
		return count;
	}
}
