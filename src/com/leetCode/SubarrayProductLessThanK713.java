package com.leetCode;
class Solution713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
    	int count=0;
    	for(int i=0;i<nums.length;i++) {
    		int product =1;
    		for(int j=i;j<nums.length;j++) {
    			System.out.print(nums[j]+" ");
    			product*=nums[j];
    			System.out.println();
    			System.out.println(product);
    			if(product<k)
        			count++;
    		}
    		//System.out.println();
    	}
      return count;  
    }
}
public class SubarrayProductLessThanK713 {

	public static void main(String[] args) {// TODO Auto-generated method stub
Solution713 sol= new Solution713();
int count=sol.numSubarrayProductLessThanK(new int[] {4,5,3}, 100);
System.out.println(count);
	}

}
