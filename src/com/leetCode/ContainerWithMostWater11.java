package com.leetCode;

import java.util.ArrayList;
import java.util.List;

class Solution11 {
	public int maxArea(int[] height) {

		int left_height = 0;
		int right_height = height.length - 1;
		int max_area = 0;
		int area = 0;

		// to get max area we should have max height and maxwidth
		while (left_height < right_height) {
			if (height[left_height] < height[right_height]) {
				area = height[left_height] * (right_height - left_height);
				left_height++;

			} else {
				area = height[right_height] * (right_height - left_height);
				right_height--;
			}
			// max_area = Math.max(max_area, area);
			if (max_area < area)
				max_area = area;

		}
		return max_area;
	}
}

public class ContainerWithMostWater11 {

	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		System.out.println(sol.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
		;

	}

}
//List<Integer> l = new ArrayList<Integer>();
//System.out.println(height.length);
//for (int i = 0; i < height.length; i++) {
//	System.out.println(i);
//	for (int j = i + 1; j < height.length; j++) {
//		if (height[j] > height[i]) {
//			if (!l.contains((j - i) * (height[i])))
//				l.add((j - i) * (height[i]));
//		} else if (height[j] < height[i]) {
//			if (!l.contains((j - i) * (height[j])))
//				l.add((j - i) * (height[j]));
//		} else {
//			if (!l.contains((j - i) * (height[i])))
//				l.add((j - i) * (height[i]));
//		}
//	}
//}
//System.out.println(l.size());
//return l.stream().max((x, y) -> x.compareTo(y)).get();
