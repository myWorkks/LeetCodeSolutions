package com.leetCode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution17 {
	public List<String> letterCombinations(String digits) {
	
		List<String> combinations = new ArrayList<String>();
		if(digits==null||digits.isEmpty())
			return combinations;
		HashMap<Integer, List<String>> numbersAndStrings = new HashMap<Integer, List<String>>();
		numbersAndStrings.put(2, List.of("a", "b", "c"));
		numbersAndStrings.put(3, List.of("d", "e", "f"));
		numbersAndStrings.put(4, List.of("g", "h", "i"));
		numbersAndStrings.put(5, List.of("j", "k", "l"));
		numbersAndStrings.put(6, List.of("m", "n", "o"));
		numbersAndStrings.put(7, List.of("p", "q", "r", "s"));
		numbersAndStrings.put(8, List.of("t", "u", "v"));
		numbersAndStrings.put(9, List.of("w", "x", "y", "z"));
		   combinations = combineLetters(digits, numbersAndStrings);
	        return combinations;
	    }

	    private List<String> combineLetters(String digits, HashMap<Integer, List<String>> numbersAndStrings) {
	        List<String> result = new ArrayList<>();

	      
	        if (digits.length() == 1) {
	            return numbersAndStrings.get(Integer.valueOf(digits));
	        }

	   
	        String firstDigit = digits.substring(0, 1);
	        String remainingDigits = digits.substring(1);

	        List<String> firstDigitLetters = numbersAndStrings.get(Integer.valueOf(firstDigit));
	        List<String> remainingDigitCombinations = combineLetters(remainingDigits, numbersAndStrings);

	        for (String letter : firstDigitLetters) {
	            for (String combination : remainingDigitCombinations) {
	                result.add(letter + combination);
	            }
	        }

	        return result;
	    }
}

public class LetterCombinationsofaPhoneNumber17 {

	public static void main(String[] args) {
		Solution17 sol = new Solution17();
		List<String> combinations = sol.letterCombinations("24");
		System.out.println(combinations);
	}

}
