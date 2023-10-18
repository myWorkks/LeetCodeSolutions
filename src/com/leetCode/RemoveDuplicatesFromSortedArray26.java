package com.leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution26 {
	public int removeDuplicates(int[] nums) {
		Arrays.sort(nums);
		Set<Integer> s = new HashSet<Integer>();
		for (Integer integer : nums) {
			s.add(integer);
		}
		return s.toArray().length;
	}
}

public class RemoveDuplicatesFromSortedArray26 {

	public static void main(String[] args) {
		Solution26 s = new Solution26();
		System.out.println(s.removeDuplicates(new int[] { 1,1,2 }));
	}

}
