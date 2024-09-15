package com.leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution264 {
	public int nthUglyNumber(int n) {

		int count = 1;
		int num = 1;
		List<Integer> uglyNumbers = new ArrayList<Integer>();
		while (count <=n) {
			System.out.print(num + " ");
			if (num == 1) {
				uglyNumbers.add(num);
				count++;
				num++;
				continue;
			}

			Set<Integer> primeFactors = primeFactors(num);
			boolean flag = true;
			for (Integer i : primeFactors) {
				if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {

				} else {
					flag = false;
					break;
				}
			}
			if (flag) {
				uglyNumbers.add(num);
				count++;
			}
			num++;
		}
		System.out.println(uglyNumbers);
		return uglyNumbers.get(uglyNumbers.size() - 1);
	}

	private Set<Integer> primeFactors(int num) {
		HashSet<Integer> primeFactors = new HashSet<Integer>();

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				if (isPrime(i)) {
					primeFactors.add(i);
				}
			}
		}
		return primeFactors;
	}

	private boolean isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		return count == 2;
	}
}

public class UglyNumberII264 {

	public static void main(String[] args) {
		new Solution264().nthUglyNumber(1100);
	}

}
