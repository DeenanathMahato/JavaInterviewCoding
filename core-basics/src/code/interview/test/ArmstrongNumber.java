package code.interview.test;

/*
 * 1. Initialize sum of cubes as 0
 * 2. For every digit do the following
 * 		a. Add cube of digit to sum of cubes.
 * 3. If sum of cubes is equal to given number,
 * 		return true.
 * 4. Else return false.
 * 
 */

public class ArmstrongNumber {
	public static boolean isArmstrongNumber(int input) {
		int sumOfCubes = 0;
		int givenInput = input;
		while(input != 0) {
			int digit = input % 10;
			sumOfCubes += Math.pow(digit, 3);//cube of digit
			input = input / 10;
		}
		
		return sumOfCubes == givenInput;
	}
	
	public static void main(String[] args) {
		System.out.println("Given Number: 153 is Armstrong or Not: " + isArmstrongNumber(153));
		System.out.println("Given Number:154 is Armstrong or Not: " + isArmstrongNumber(154));
	}
}
