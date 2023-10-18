package com.leetCode;

import java.util.LinkedList;

class Solution75 {
	public void sortColors(int[] nums) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				l.add(nums[i]);
			} else if (nums[i] == 0)
				l.addFirst(nums[i]);
			else if (nums[i] == 2)
				l.addLast(nums[i]);
		}
		System.out.println(l);
	}
}

public class SortColors75 {

	public static void main(String[] args) {
		Solution75 s = new Solution75();
		s.sortColors(new int[] { 1,2, 0, 2, 1, 1, 0 });

	}

}
//int a = 0;
//for (int i = 0; i < nums.length; i++) {
//	for (int j = i + 1; j < nums.length; j++) {
//		if (nums[i] > nums[j]) {
//			a = nums[i];//a=2
//			nums[i] = nums[j];//
//			nums[j] = a;
//		}
//	}
//}
//for (int i : nums) {
//	System.out.println(i);
//}
