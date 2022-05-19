package code.interview.test;

/*
 * input: {1, 0, 2, 0, 5, 3, 0}
 * output: {1, 3, 2, 5, 0, 0, 0}
 * 
 * input: {0, 1}
 * output: {1, 0}
 * 
 * input: {1, 0} -> {1, 0}
 * 
 * */
public class MovingZeroAtEnd {

	public static void moveZeroAtEnd(int[] numbers) {
		int left = 0;
		int right = numbers.length - 1;

		while (left < right) {
			if (numbers[left] == 0 && numbers[right] != 0) {
				// after swapping move cursor to the next index
				swap(numbers, left, right);
				left++;
				right--;
			}

			if (numbers[left] != 0)
				left++;
			if (numbers[right] == 0)
				right--;
		}
	}

	public static void swap(int[] arr, int leftIndex, int rightIndex) {
		arr[leftIndex] = arr[rightIndex];
		arr[rightIndex] = 0;
	}

	public static void main(String[] args) {
		int[] numbers = {0,1,1,0,0}; // {1, 0, 2, 0, 5, 3, 0}, {0, 0, 0, 0, 0, 0, 0}
		moveZeroAtEnd(numbers);

		if (numbers.length > 0) {
			System.out.print("{" + numbers[0]);
			for (int i = 1; i < numbers.length; i++) {
				System.out.print(", " + numbers[i]);
			}
			System.out.println("}");
		} else 
			System.out.println("{}");
	}

}
