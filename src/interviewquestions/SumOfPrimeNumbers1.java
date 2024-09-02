package interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class SumOfPrimeNumbers1 {
	public static void main(String[] args) {
		// 2,3,5,7,11,13=41
		System.out.println(new SumOfPrimeNumbers1().sumOfPrimes(6));
	}

	public int sumOfPrimes(int n) {
		int count = 1;
		int sum = 0;
		int number = 2;
		List<Integer> primesList = new ArrayList<Integer>();
		while (count <= n) {

			if (isPrime(number, primesList)) {

				count++;
				sum += number;
				primesList.add(number);
			}
			number++;
		}
		return sum;
	}

	private boolean isPrime(int number, List<Integer> primesList) {
		for (int i = 0; i < primesList.size(); i++) {
			if (number % primesList.get(i) == 0) {

				return false;
			}
		}
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				count++;
		}
		return count == 2;
	}

}

