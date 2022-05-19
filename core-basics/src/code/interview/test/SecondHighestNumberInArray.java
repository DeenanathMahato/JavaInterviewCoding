package code.interview.test;

public class SecondHighestNumberInArray {

	public static int findSecondHighestNumber(int[] numbers) {
		
		int max = numbers[0];
		int secondMax = Integer.MIN_VALUE;
		
		for(int i = 1; i < numbers.length; i++) {
			if(max < numbers[i]) {
				secondMax = max;
				max = numbers[i];
			} else {
				if(secondMax < numbers[i])
					secondMax = numbers[i];
			}
		}
		
		return secondMax;
	}
	
	public static void main(String[] args) {
		
		int[] numbers = new int[] {1, 3, 4, 2, 5}; // {1, 3, 4, 2, 5} - 4, {1, 2} -> 1
		
		int secondMaximumNumber = findSecondHighestNumber(numbers);
		System.out.println("Second Maximum Number: " + secondMaximumNumber);
		
	}
}
