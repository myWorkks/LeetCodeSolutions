package com.leetCode;

class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
   	int count=0;
    	for(int i=0;i<nums.length;i++) {
    		for(int j=i+1;j<nums.length;j++) {
    			if(nums[i]==nums[j])
    				count++;
    		}
    	}
    	
        return count;
    }
}
public class NumberOfGoodPairs1512 {

	public static void main(String[] args) {
		System.out.println(new Solution1512().numIdenticalPairs(new int[] {1,1,1,1}));

	}

}
