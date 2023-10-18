package com.leetCode;

class Solution65 {
//	public boolean isNumber(String s) {
//		if (s.equals("."))
//			return false;
//		String regex = "[+-[0-9]/.]+([e][1-9]){0,1}";
//		String invalidr = "[/.]+";
//		return s.matches(regex) && !s.matches(invalidr);
//	}
	public boolean isNumber(String s) {
		 
	    String regex = "[-+]?(\\d+\\.?|\\.\\d+)\\d*([Ee][-+]?\\d+)?";
	    
	  
	    return s.matches(regex) && !s.contains("..");
	}

}

public class ValidNumber65 {

	public static void main(String[] args) {
		Solution65 sol = new Solution65();
		boolean b = sol.isNumber(".1");
		System.out.println(b);

	}

}
