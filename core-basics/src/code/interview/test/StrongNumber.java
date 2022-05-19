package code.interview.test;

/*
 * 1. Initialize sum of factorial as 0
 * 2. For every digit d, do following
 *  a. Add d! to sum of factorial
 * 3. If sum factorial is same as given number,
 * 	return true.
 * 4. Else return false. 
 * 
 */

public class StrongNumber {

	public static boolean isStrongNumber(int inputNumber) {
		int sumOfFactorial = 0;
		int givenNumber = inputNumber;
		while(inputNumber != 0) {
			int d = inputNumber % 10;
			sumOfFactorial += factorial(d);
			inputNumber = inputNumber / 10;
		}
		
		return sumOfFactorial == givenNumber;
	}
	
	private static int factorial(int num) {
		if(num == 0)
			return 1;
		return num * factorial(num - 1);
	}
	
	public static void main(String[] args) {
		System.out.println("Is Given number is strong number: " + isStrongNumber(145));
		System.out.println("Is Given number is strong number: " + isStrongNumber(146));
	}
}
