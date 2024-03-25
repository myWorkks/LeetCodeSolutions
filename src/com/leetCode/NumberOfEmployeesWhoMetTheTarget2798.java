package com.leetCode;
class Solution2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
    	int count=0;
    	for(int h:hours) {
    		if(h>=target) {
    			count++;
    		}
    	}
        return count;
    }
}
public class NumberOfEmployeesWhoMetTheTarget2798 {

	public static void main(String[] args) {
		
Solution2798 sol= new Solution2798();
System.out.println(sol.numberOfEmployeesWhoMetTarget(new int [] {5,1,4,2,2}, 6));
	}

}
