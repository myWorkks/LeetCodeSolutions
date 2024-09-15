package com.leetCode;
class Solution2114{
	 public int mostWordsFound(String[] sentences) {
	        int maxWords=Integer.MIN_VALUE;
	        for(String sentence:sentences) {
	        	if(sentence.split(" ").length>maxWords) {
	        		maxWords=sentence.split(" ").length;
	        	}
	        }
	        return maxWords;
	    }
}
public class MaximumNumberOfWordsFoundInSentences2114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
