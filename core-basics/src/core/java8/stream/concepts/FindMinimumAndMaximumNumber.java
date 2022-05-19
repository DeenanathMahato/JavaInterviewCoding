package core.java8.stream.concepts;

import java.util.List;
import java.util.Optional;

public class FindMinimumAndMaximumNumber {
	
	public static Integer findMinimum(List<Integer> numbers) {
		Optional<Integer> minOpt = numbers.stream().reduce(Integer::min);
		if(minOpt.isEmpty())
			return -1;
		return minOpt.get();
	}
	
	public static Integer findMinimum2(List<Integer> numbers) {
		Optional<Integer> minValueOpt = numbers.stream().reduce(Math::min);
		Integer min = -1;
		if(minValueOpt.isPresent())
			min = minValueOpt.get();
		return min;
	}

	public static Integer findMinimum3(List<Integer> numbers) {
		return numbers.stream().reduce(Integer.MAX_VALUE, Integer::min);
	}


	public static Integer findMaximum(List<Integer> numbers) {
		Optional<Integer> maxOpt = numbers.stream().reduce(Integer::max);

		Integer max = -1;
		if(maxOpt.isPresent())
			max = maxOpt.get();
		return max;
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 5, 6, 7, 1, 8);
		
		Integer minValue = findMinimum(numbers);
		System.out.println("Minimum value in list: " + minValue);
		
		Integer minValue2 = findMinimum2(numbers);
		System.out.println("Minimum value2: " + minValue2);
		
		Integer minValue3 = findMinimum3(numbers);
		System.out.println("Minimum value3: " + minValue3);
		
		Integer maxValue = findMaximum(numbers);
		System.out.println("Maximum value in list: " + maxValue);
	}
}
