package com.leetCode;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution179 {
	public String largestNumber(int[] nums) {
		String ss = Arrays.stream(nums).boxed().map(a -> a.toString())
				.sorted((x, y) -> x.charAt(0) == y.charAt(0) ? -(x + y).compareTo(y + x) : -x.compareTo(y))
				.collect(Collectors.joining(""));
		return ss.matches("[0]+")?"0":ss;

	}
}

public class LargestNumber179 {

	public static void main(String[] args) {
		Solution179 s = new Solution179();
		String ss = s.largestNumber(new int[] { 0, 0, 0, 0 });
		System.out.println(ss);
	}

}
