package com.leetCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TenthLine195 {
	public static void main(String[] args) throws IOException {
		BufferedReader fr = new BufferedReader(new FileReader(new File("file.txt")));
		String line;
		int count = 1;
		while ((line = fr.readLine()) != null) {
			if (count++ == 10)
				break;

		}
		System.out.println(line);
	}
}
