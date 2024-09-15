package com.leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

class Solution2284 {
	public String largestWordCount(String[] messages, String[] senders) {
		HashMap<String, Integer> senderMsgCount = new HashMap<String, Integer>();

		for (int i = 0; i < senders.length; i++) {

			if (senderMsgCount.containsKey(senders[i])) {

				senderMsgCount.put(senders[i], senderMsgCount.get(senders[i]) + messages[i].split(" ").length);
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
	}
}
