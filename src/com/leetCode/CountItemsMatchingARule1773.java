package com.leetCode;

import java.util.Arrays;
import java.util.List;

class Solution1773 {
	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;

		for (List<String> item : items) {
			switch (ruleKey) {

			case "type": {
				if (item.get(0).equals(ruleValue))
					count++;
				break;
			}
			case "color": {
				if (item.get(1).equals(ruleValue))
					count++;
				break;
			}
			case "name": {
				if (item.get(2).equals(ruleValue))
					count++;
				break;
			}
			}

		}
		return count;
	}
}

public class CountItemsMatchingARule1773 {

	public static void main(String[] args) {
		Solution1773 sol = new Solution1773();
		// [[],[],[]
	int a=	sol.countMatches(Arrays.asList(Arrays.asList("phone","blue","pixel"),
				Arrays.asList("computer","silver","phone"),
				Arrays.asList("phone", "gold", "iphone")), 
			    "type",
				"phone");
System.out.println(a);
	}

}
