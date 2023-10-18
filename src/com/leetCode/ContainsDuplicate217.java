package com.leetCode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Solution217 {
	public boolean containsDuplicate(int[] nums) {
		boolean b = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					System.out.println(nums[i] + ":" + nums[j]);
					b = true;
					break;

				} else {
					b = false;
				}
			}
			if(b==true)
				break;
		}
		return b;
//		Arrays.sort(nums);
//		Set<Integer> set = new TreeSet<Integer>();
//		boolean b = false;
//		for (int i = 0; i < nums.length; i++) {
//			b = set.add(nums[i]);
//			if (b == false) {
//				b = true;
//				break;
//			}else {
//				b=false;
//			}
//
//		}
//
//		return b;
	}
}

public class ContainsDuplicate217 {

	public static void main(String[] args) {
		Solution217 s = new Solution217();
		System.out.println(s.containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));
		;
	}

}
