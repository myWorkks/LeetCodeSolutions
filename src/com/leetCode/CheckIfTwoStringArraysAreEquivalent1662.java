package com.leetCode;
class Solution1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      String s1="";
      String s2="";
      for(String s:word1)
      s1+=s;  
      for(String s:word2)
      s2+=s;
      return s1.equals(s2);
    }
}
public class CheckIfTwoStringArraysAreEquivalent1662 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
