package com.leetCode;

class Solution67 {
	public String addBinary(String a, String b) {
		long c = 0;
		try {
			long a1 = Long.parseLong(a, 2);
			long b1 = Long.parseLong(b, 2);
			c = a1 + b1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return Long.toBinaryString(c);
	}
}

public class BinarySum67 {

	public static void main(String[] args) {
		Solution67 s = new Solution67();
		String a, b;
		a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		System.out.println(s.addBinary(a, b));
		;

	}

}
