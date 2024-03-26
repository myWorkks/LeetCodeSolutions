package com.leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> missingNumbers = new ArrayList<Integer>();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		// int minValue=1;
		int noOfIntegers = nums.length;
		for (int i : nums) {

			hashSet.add(i);
		}

		for (int i = 1; i <=noOfIntegers;) {
			if (hashSet.contains(i)) {
				i++;
				continue;

			} else {
				missingNumbers.add(i);
				i++;
			}

		}

		return missingNumbers;
	}

}

public class FindAllNumbersDisappearedInAnArray448 {

	public static void main(String[] args) {
		System.out.println(new Solution448().findDisappearedNumbers(new int[] { 1,1,2, 2 }));

	}

}
