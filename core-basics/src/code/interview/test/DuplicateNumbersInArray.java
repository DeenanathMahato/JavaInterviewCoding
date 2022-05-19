package code.interview.test;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbersInArray {

	// find duplicate numbers in single iteration
	public static void findDuplicateNumbers(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}

		//print duplicate numbers
		map.forEach((k, v) -> {
			if(v > 1) {
				System.out.println(k + "-" + v);
			}
		});
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 2, 4, 5, 3 };
		findDuplicateNumbers(arr);
	}

}
