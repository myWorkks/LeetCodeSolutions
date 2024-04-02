package com.leetCode;
class Solution1816 {
    public String truncateSentence(String s, int k) {
      StringBuilder sb= new StringBuilder();
      int stringCount=0;
        for(String split:s.split(" ")){
            if(stringCount==k)break;
            sb.append(split+" ");
            stringCount++;

        }
        return sb.toString().trim();
    }
}
public class TruncateSentence1816 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
