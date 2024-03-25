package com.leetCode;

import java.util.ArrayList;
import java.util.List;

class Solution1431{
public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	List<Boolean> list= new ArrayList<Boolean>();
	int maxValue=Integer.MIN_VALUE;
	//int actualMaxValue=0;
	for(int a:candies) {
		if(a>maxValue) {
			maxValue=a;
		}
	}
	for(int a:candies) {
		if(a+extraCandies>=maxValue) {
			list.add(true);
		}
		else
			list.add(false);
			
	}
	System.out.println(maxValue);
	return list;
        
    }
}
public class KidsWithTheGreatestNumberOfCandies1431 {

	public static void main(String[] args) {
		Solution1431 sol= new Solution1431();
		List<Boolean> list=	sol.kidsWithCandies(new int[] {12,1,12}, 10);
System.out.println(list);
	}

}
