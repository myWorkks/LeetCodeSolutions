package com.leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

class Solution347 {
	
	int index = 0;

	public int[] topKFrequent(int[] nums, int k) {
		HashMap<Integer, Integer> intCount = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (intCount.containsKey(nums[i])) {
				intCount.put(nums[i], intCount.get(nums[i]) + 1);
			} else
				intCount.put(nums[i], 1);
		}
		// System.out.println(intCount);
		Stack<Integer> stack = new Stack<Integer>();
		int[] a = new int[k];
		intCount.entrySet().stream().sorted((x, y) -> -x.getValue().compareTo(y.getValue())).forEach(x -> {
			//System.out.println("in for " + x);
			if (stack.size() < k) {
				stack.push(x.getKey());
				a[index] = stack.peek();
				index++;
			}
			
		});
		//System.out.println(stack);
		return a;
	}
}

public class TopKFrequentElements347 {

	public static void main(String[] args) {
		Solution347 s = new Solution347();
		int a[] = s.topKFrequent(new int[] {1,2 }, 2);
		for (int a1 : a) {
			System.out.println(a1);
		}
	}

}
