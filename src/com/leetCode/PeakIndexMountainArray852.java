package com.leetCode;

class Solution852 {
	public int peakIndexInMountainArray(int[] arr) {
		int peekIndex = 0;
		boolean b = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					peekIndex = i;
					b = true;
					break;
				} else
					peekIndex = j;
				b = false;
				break;
			}
			if (b)
				break;
		}
		System.out.println(peekIndex);
		return peekIndex;
	}
}

public class PeakIndexMountainArray852 {

	public static void main(String[] args) {
		Solution852 s = new Solution852();
		s.peakIndexInMountainArray(new int[] { 0, 1, 2, 0 });
	}

}
