package com.leetCode;

class Solution88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0;
		int j = 0;
		int k = 0;

		int arr[] = new int[m + n];
		int index = m <= n ? m : n;

		while (k < index) {
			if (nums1[i] <= nums2[j]) {
				arr[k] = nums1[i];
				i++;
			} else {
				arr[k] = nums2[j];
				j++;
			}

			k++;
		}
		
		
		if (j < nums2.length ) {
			for (; j < nums2.length; j++) {
				arr[k] = nums2[j];
				k++;
			}
		} if (i < m ) {
			for (; i < m; i++) {
				arr[k] = nums1[i];
				k++;
			}

		}
		

	}
}

public class MergeSortedArray88 {

	public static void main(String[] args) {
		Solution88 s = new Solution88();
		s.merge(new int[] {  1,3,7,9,0,0,0 }, 4, new int[] { 2,5,6 }, 3);
	}

}
//List<Integer> list = new ArrayList<Integer>();
//for (int i=0;i<m;i++)
//	list.add(nums1[i]);
//for (int a : nums2)
//	list.add(a);
//Collections.sort(list);
//nums1 = new int[m + n];
//System.out.println(list);
//for (int i = 0; i < list.size(); i++) {
//	
//	nums1[i] = list.get(i);
//	System.out.println(nums1[i]);
//}