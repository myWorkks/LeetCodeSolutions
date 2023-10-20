package com.leetCode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class SolutionNew219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {

		int i = 0;
		int j = 0;
		boolean b = false;
	
		Set<Integer> set = new HashSet<Integer>();
		
		if(k==nums.length||nums.length<k) {
			for(int index=0;index<nums.length;index++) {
				if(!set.add(nums[index])) {
					b=true;
				}
			}
			return b;
		}
		while (j < nums.length) {
			if (j - i < k) {
				
					j++;
				
				
				
			} else {
				if (j == k) {
				
					for (int index = i; index <= j; index++) {
						if (!set.add(nums[index])) {
							b = true;
							break;
						}
					}
					i++;
					j++;
				} else {
					
					set.remove(nums[j - k - 1]);
					if (!set.add(nums[j])) {
						b = true;
						break;
					} else {
						i++;
						j++;
					}
				}

			}
		}
		return b;
	}
}

public class ContainsDuplicateII219 {

	public static void main(String[] args) {
		SolutionNew219 s = new SolutionNew219();
		boolean b = s.containsNearbyDuplicate(new int[] { 99, 99 }, 3);
		System.out.println(b);
	}

}
