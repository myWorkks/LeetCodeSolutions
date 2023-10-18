package com.leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Solution136 {
	public int singleNumber(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : nums) {
			list.add(i);
		}
		List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());

		Set<Integer> set = new TreeSet<Integer>();
		List<Integer> duplicates = list.stream().filter(t -> !set.add(t)).collect(Collectors.toList());
		distinct.removeAll(duplicates);
		System.out.println(distinct);
		return distinct.get(0);
	}
}

public class SingleNumber136 {
	public static void main(String[] args) {
		Solution136 s = new Solution136();
		s.singleNumber(new int[] { 4,1,2,1,2 });
	}
}
