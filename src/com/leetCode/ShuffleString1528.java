package com.leetCode;

class Solution1528 {
    public String restoreString(String s, int[] indices) {
    	
    	//Arrays.sort(indices);
       
        StringBuilder sb= new StringBuilder();
        for(int i:indices) {
        	
        	sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
public class ShuffleString1528 {

	public static void main(String[] args) {
		System.out.println(new Solution1528().restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3}));

	}

}
