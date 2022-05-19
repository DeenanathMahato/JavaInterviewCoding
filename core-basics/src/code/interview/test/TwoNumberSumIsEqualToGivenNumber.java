package code.interview.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoNumberSumIsEqualToGivenNumber {

	//it is not recommended since time complexity is o(2n)
	public static int[] findIndexOfTwoNumberSum(int[] input, int target) {
		int length = input.length;

		Map<Integer, Integer> storeNumberAndIndex = new HashMap<>();
		for (int index = 0; index < length; index++) {
			storeNumberAndIndex.put(input[index], index);
		} // o(n)

		for (int i = 0; i < length; i++) {
			int nextNum = target - input[i];
			if (storeNumberAndIndex.containsKey(nextNum) && i != storeNumberAndIndex.get(nextNum)) {
//				return new int[] { input[i], nextNum }; // number as output [5, 3]
				return new int[] {i, storeNumberAndIndex.get(nextNum)}; // index as output [3, 4]
			}

		} // o(n)
			// o(2n)

		return new int[] {};
	}
	
	// this one is recommended TC: o(n)
	public static List<Integer> findIndexOfTwoNumberSumUsingMap(int[] numbers, int target) {
		Map<Integer, Integer> inputStorage = new HashMap<>();
		List<Integer> output = new ArrayList<>();
		
		for(int index = 0; index < numbers.length; index++) {
			int firstNumber = numbers[index];
			int secondNumber = target - firstNumber;
			
			if(inputStorage.containsKey(secondNumber)) {
				output.add(inputStorage.get(secondNumber)); //adding second number index
				output.add(index);
			}
			
			inputStorage.put(firstNumber, index);
		}
		
		return output;
	}

	public static void main(String[] args) {
		int[] numbers = new int[] { 2, 1, 4, 5, 3 };
		int target = 8;
		
		int[] results = findIndexOfTwoNumberSum(numbers, target);
		for(int n : results) {
			System.out.println(n);
		}
		
		System.out.println("find Index of Two Number which sum is given number using Map");
		List<Integer> indexes = findIndexOfTwoNumberSumUsingMap(numbers, target);
		indexes.forEach(System.out::println);
	}
}
