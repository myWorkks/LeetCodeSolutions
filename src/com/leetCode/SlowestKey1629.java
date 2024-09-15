package com.leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution1629 {
	public char slowestKey(int[] releaseTimes, String keysPressed) {
		Map<Integer, Integer> indexAndTimings = new HashMap<Integer, Integer>();

		for (int i = 0; i  < releaseTimes.length; i++) {
			if (i == 0) {
				indexAndTimings.put(i, releaseTimes[i]);
			} else {
				indexAndTimings.put(i, releaseTimes[i ] - releaseTimes[i-1]);
			}
		}
		System.out.println(indexAndTimings);
		int maxTime = 0;
		for (int a : indexAndTimings.values()) {
			if (a > maxTime)
				maxTime = a;
		}
		List<Integer> indecies = new ArrayList<Integer>();
		for (int a : indexAndTimings.keySet()) {
			if (indexAndTimings.get(a) == maxTime) {
				indecies.add(a);
			}
		}
		List<Character> c = new ArrayList<Character>();
		for (int a : indecies) {
			c.add(keysPressed.charAt(a));
		}

		return c.stream().max((a1, b1) -> a1.compareTo(b1)).get();
	}
}

public class SlowestKey1629 {

	public static void main(String[] args) {
		System.out.println(new Solution1629().slowestKey(new int[] {9,29,49,50},"cbcd"));

	}

}
