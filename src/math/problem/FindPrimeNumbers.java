package math.problem;

public class FindPrimeNumbers {

	/**
	 * Please do the flowing problem.
	 */
	public static void main(String[] args) {

		/*
		 * Find the prime numbers from 1 to 1000 then print to console.Also
		 * print out the total prime numbers within the range. (prime numbers
		 * are only divisible by number 1 and the number itself.) (for example
		 * numbers like 2,3,5,7,9,11,13.....n are prime numbers.
		 */
		Boolean isPrime = true;
		int maxNumber = 1000;
		int numberOfPrimeNUmber = 0;

		for (int i = 2; i <= maxNumber; i++) {
			isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					j = i;
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(i);
				numberOfPrimeNUmber++;
			}
		}

		System.out.println(numberOfPrimeNUmber);

	}

}
