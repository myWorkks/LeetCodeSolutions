package com.leetCode;

import java.util.ArrayList;
import java.util.List;

class Solution2785 {
    public String sortVowels(String s) {
    	
    	List<Integer> indices= new ArrayList<Integer>();
    	List<Character> characters= new ArrayList<Character>();
    	int i=0;
    	for(Character c:s.toCharArray()) {
    		if(c.toString().matches("[aeiouAEIOU]")) {
    			indices.add(i);
    			characters.add(c);
    		}
    		i++;
    	}
    	
        return s;
    }
}
public class SortVowelsInAString2785 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
