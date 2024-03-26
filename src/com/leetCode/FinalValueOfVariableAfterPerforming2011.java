package com.leetCode;
class Solution2011 {
    public int finalValueAfterOperations(String[] operations) {
        int value=0;
        for(String operation:operations) {
        	if(operation.contains("+")) {
        		value+=1;
        	}
        	else
        		value-=1;
        }
        return value;
    }
}
public class FinalValueOfVariableAfterPerforming2011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
