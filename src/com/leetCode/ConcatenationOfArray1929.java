package com.leetCode;
class Solution1929 {
    public int[] getConcatenation(int[] nums) {
      int[] ans= new int[2*nums.length]  ;
      int baseIndex=0;
      for(int i=0;i<2*nums.length;i++) {
    	 // System.out.print(baseIndex);
    	  ans[i]=nums[baseIndex];
    	 
    	  if(baseIndex==nums.length-1)
    		  baseIndex=-1;
    	  baseIndex++;
      }
      return ans;
    }
}
public class ConcatenationOfArray1929 {

	public static void main(String[] args) {
		for(int a: new Solution1929().getConcatenation(new int[] {1,3,2,1})) {
			System.out.print(a +" ");
		}
	}

}
