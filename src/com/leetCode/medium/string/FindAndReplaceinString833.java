package com.leetCode.medium.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution833 {
	public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
		String finalS = s;
		Comparator<Integer> cc = (a, b) -> b.compareTo(a);
		List<Integer> intList = new ArrayList<Integer>();
		for (int in : indices) {
			intList.add(in);
		}

		Collections.sort(intList, cc);
		for (int i = 0; i < intList.size(); i++) {
			String source = sources[i];
			int index =intList.get(i);
			// System.out.println("index " + index);
			String target = targets[i];
			int lengthOfString = source.length();

			String subString = s.substring(index, index + lengthOfString);
//			System.out.println("sub string " + subString);
//			System.out.println("source " + source);
//			System.out.println("target " + target);
			// s = s.replace(subString, targets[i]);
			if (subString.equals(source)) {
				// System.out.println(subString.equals(source));
				finalS = finalS.replace(subString, target);
				// System.out.println("final S " + finalS);
			}

		}
		return finalS;
	}

}

public class FindAndReplaceinString833 {

	public static void main(String[] args) {
		String s = "fvokzonyhukpwbnkomdianhirsvdulhsfseaqzktupyeverfsd";
		int[] indices = new int[] { 26, 30, 38, 2, 41, 10, 8, 44, 19, 4, 13, 28, 21, 35, 23, 16 };
		String[] sources = new String[] { "vd", "hsfs", "ktu", "ok", "pye", "kp", "hu", "verfs", "ia", "zon", "bnk",
				"ul", "nh", "aqz", "irs", "om" };
		String targets[] = new String[] { "h", "gdlf", "nl", "sr", "xhn", "ax", "arf", "ifuax", "a", "mk", "vwqe",
				"fdl", "n", "miyr", "ibh", "den" };

		Solution833 sol = new Solution833();
		String ss = sol.findReplaceString(s, indices, sources, targets);
		System.out.println(ss);
	}
}

//if (subString.equals(source)) {
//	adjustIndex = true;
//	index = adjustIndex(indices[i], sources[i].length(), targets[i].length());
//	//s = s.replace(subString, targets[i]);
//	System.out.println(s);
//} else
//	adjustIndex = false;
//Map<Integer, String> indexAndString = new HashMap<Integer, String>();
//
//for (int i = 0; i < indices.length; i++) {
//	String source = sources[i];
//
//	int index = indices[i];
//
//	int lengthOfString = source.length();
//
//	String subString = s.substring(index, index + lengthOfString);
//	System.out.println("sub string " + subString);
//	// s = s.replace(subString, targets[i]);
//	if (subString.equals(source)) {
//		int newIndex = targets[i].length() >= sources[i].length()
//				? targets[i].length() - sources[i].length() + 1
//				: sources[i].length() - targets[i].length() + 1;
//		indexAndString.put(newIndex, targets[i]);
//	}
//}
//System.out.println("final string " + s);
//System.out.println("map " + indexAndString);
//return s;