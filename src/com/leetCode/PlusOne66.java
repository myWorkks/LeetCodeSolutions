package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Solution66 {
	public int[] plusOne(int[] digits) {
		int lastIndex = digits.length - 1;
		// System.out.println(lastIndex);

		int lastDigit = digits[lastIndex];
		// System.out.println(lastDigit);
		ArrayList<Integer> al = new ArrayList<Integer>();
		boolean b = false;
		while (lastIndex >= 0) {
			if (lastDigit == 9) {
				al.add(0);
				lastIndex--;
				if (lastIndex >= 0) {
					lastDigit = digits[lastIndex];
				} else {
					al.add(1);
				}
			} else {
				al.add(lastDigit + 1);
				for (int i = lastIndex-1; i >= 0; i--) {
					al.add(digits[i]);
				}
				break;
			}
		}
		int[] a = new int[al.size()];
		int lastindex = al.size() - 1;
		for (int i : al) {
			a[lastindex] = i;
			lastindex--;
		}
		return a;
	}
}

public class PlusOne66 {

	public static void main(String[] args) {
		Solution66 s = new Solution66();
		int[] b = s.plusOne(new int[] {9});
		for (int i : b) {
			System.out.println(i);
			;
		}

	}

}
//int lastnum = digits[digits.length - 1];
//lastnum = lastnum + 1;
//
//ArrayList<Integer> al = new ArrayList<Integer>();
//for (int i = 0; i < digits.length - 1; i++) {
//	al.add(digits[i]);
//}
//
//int size = al.size();
//System.out.println(size);
//boolean b = true;
//if (lastnum == 10) {
//	while (b) {
//		System.out.println(al.get(size - 1));
//		if (al.get(size - 1) == 9) {
//			b = true;
//			al.add(0);
//			size -= 1;
//		} else
//			b = false;
//		al.add(1);
//		al.add(0);
//	}
//
//} else {
//	al.add(lastnum);
//}
//digits = new int[al.size()];
//int j = 0;
//for (int i : al) {
//	digits[j] = i;
//	j++;
//}
//return digits;