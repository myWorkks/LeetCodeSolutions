package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution1487 {
	public String[] getFolderNames(String[] names) {
		HashMap<String, Integer> nameCount = new HashMap<String, Integer>();
		ArrayList<String> folderNames = new ArrayList<String>();
		for (String name : names) {
			if (!nameCount.containsKey(name)) {
				folderNames.add(name);
				nameCount.put(name, 1);
			} else {
				int count = nameCount.get(name);
				String nameChange = name + "(" + count + ")";
				while (nameCount.containsKey(nameChange)) {
					count++;
					nameChange = name + "(" + count + ")";
				}
				folderNames.add(nameChange);
				nameCount.put(nameChange, 1);
				nameCount.put(name,(nameCount.get(name))+1  );
			}
		}
		return folderNames.toArray(new String[] {});
	}
}

//	

public class MakingFileNamesUnique1487 {

	public static void main(String[] args) {
		Solution1487 s = new Solution1487();
		String[] result = s.getFolderNames(new String[] {"gta","gta(1)","gta","avalon"});

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < result.length; i++) {
			sb.append(" " + result[i]);
		}
		System.out.println(sb);
	}

}

//int j = 0;
//
//	ArrayList<String> finalList = new ArrayList<String>();
//
//	while (j < names.length) {
//		if (finalList.isEmpty()) {
//			finalList.add(names[0]);
//		} else {
//			if (finalList.contains(names[j])) {
//
//				int presentIndex = finalList.indexOf(names[j]);
//				String presentString = finalList.get(presentIndex);
//
//				int k = 1;
//				String temp = presentString + "(" + k + ")";
//				while (finalList.contains(temp)) {
//					k++;
//					temp = presentString + "(" + k + ")";
//				}
//				finalList.add(temp);
//			}
//
//			else {
//				finalList.add(names[j]);
//			}
//		}
//
//		j++;
//	}
//	return finalList.toArray(new String[] {});
//}
//}