package com.leetCode;

import java.util.ArrayList;
import java.util.List;

class Solution2785 {
    public String sortVowels(String s) {
    	
    	List<Integer> indices= new ArrayList<Integer>();
    	List<Character> characters= new ArrayList<Character>();
    	int i=0;
    	char[] ch= new char[s.length()];
    	for(Character c:s.toCharArray()) {
    		ch[i]=c;
    		if(c.toString().matches("[aeiouAEIOU]")) {
    			indices.add(i);
    			characters.add(c);
    		}
    		i++;
    	}
    	
    	if(indices.size()==characters.size()) {
    		
    		characters.sort((a,b)->a.compareTo(b));
    		for(int j=0;j<indices.size();j++) {
    			ch[indices.get(j)]=characters.get(j);
    		}
    		
    	}
    	
        return new String(ch);
    }
}
public class SortVowelsInAString2785 {

	public static void main(String[] args) {
		System.out.println(new Solution2785().sortVowels("bharAth"));
	}

}
