package com.leetCode;

class Solution520 {
	public boolean detectCapitalUse(String word) {
		return word.matches("[A-Z]+")||word.matches("[a-z]+")||word.matches("[A-Z][a-z]+");
	}
}

public class DetectCapital520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution520 s = new Solution520();
		s.detectCapitalUse("Uoo");
	}

}
