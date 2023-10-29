package com.leetCode;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

class Solution692 {

	

	public List<String> topKFrequent(String[] words, int k) {

		HashMap<String, Integer> intCount = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			if (intCount.containsKey(words[i])) {
				intCount.put(words[i], intCount.get(words[i]) + 1);
			} else
				intCount.put(words[i], 1);
		}
		// System.out.println(intCount);
		List<String> stack = new Stack<String>();

		intCount.entrySet().stream().sorted((x, y) -> x.getValue().equals(y.getValue())?x.getKey().compareTo(y.getKey()):y.getValue().compareTo(x.getValue())).forEach(x -> {
			// System.out.println("in for " + x);
			if (stack.size() < k) {
				stack.add(x.getKey());

			}

		});
		// System.out.println(stack);
		return stack;
	}
}

public class TopKFrequentWords692 {

	public static void main(String[] args) {
		Solution692 s = new Solution692();
		List a = s.topKFrequent(new String[] { "i", "love", "leetcode", "i", "love", "coding" }, 2);
		System.out.println(a);
	}

}
