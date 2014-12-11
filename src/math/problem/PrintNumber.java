package math.problem;

public class PrintNumber {

	/**
	 * Please solve the following problem in java code.
	 */
	public static void main(String[] args) {

		/*
		 * use a for loop to print 1 to 100 and then store into an array.then
		 * use another for loop to print only odd numbers.Then add thetotal
		 * numbers from the array.
		 */

		int total = 0;
		int array[] = new int[101];
		for (int i = 0; i <=array.length-1; i++) {
			System.out.println(i);
			array[i] = i;
			total += array[i];

		}
		System.out.println("The total is " + total);
		
		System.out.println();
		System.out.println("Here comes the add numbers");

		for (int i = 1; i <=array.length-1; i += 2) {
			System.out.println(i);

		}
	}

}
