package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		List<Integer> list = new ArrayList<Integer>();
		for (int a : nums1)
			list.add(a);
		for (int a : nums2)
			list.add(a);
		Collections.sort(list);
		nums1 = new int[m + n];
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i);
			nums1[i] = list.get(i);

		}
	}
}

public class MergeSortedArray88 {

	public static void main(String[] args) {
		Solution88 s = new Solution88();
		s.merge(new int[] { 1, 2, 3 }, 3, new int[] { 1, 5, 7 }, 3);
	}

}
