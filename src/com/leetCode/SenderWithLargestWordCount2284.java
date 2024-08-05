package com.leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Solution2284 {
	public String largestWordCount(String[] messages, String[] senders) {
		HashMap<String, Integer> senderMsgCount = new HashMap<String, Integer>();
	//	HashMap<String, List<Integer>> sendersCount = new HashMap<String, List<Integer>>();
		for (int i = 0; i < senders.length; i++) {
			
			if (senderMsgCount.containsKey(senders[i])) {
				
				senderMsgCount.put(senders[i], senderMsgCount.get(senders[i])+messages[i].split(" ").length);
			} else {
				senderMsgCount.put(senders[i], messages[i].split(" ").length);
			}
			

			
		}
		
		System.out.println(senderMsgCount);
		Optional<Map.Entry<String, Integer>> ii = senderMsgCount.entrySet().stream()
				.sorted((x, y) -> x.getValue().equals(y.getValue()) ? -x.getKey().compareTo(y.getKey())
						: -x.getValue().compareTo(y.getValue()))
				.findFirst();// -Integer.valueOf(x.getKey().length()).compareTo(Integer.valueOf(y.getKey().length()))
		if (ii.isPresent()) {
			return ii.get().getKey();
		} else {
			return null;
		}
	}
}

public class SenderWithLargestWordCount2284 {

	public static void main(String[] args) {
		Solution2284 s = new Solution2284();
		String ss = s.largestWordCount(new String[] {
				"k a c N O O W d R U r Q s M i R a x y u T P S O H S d R z A S s c j m h c L Z j r Y u m n m w q ZW",
			
		},new String[] {});
		System.out.println(ss);
	}

}
