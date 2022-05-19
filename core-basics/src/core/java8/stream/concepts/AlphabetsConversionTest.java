package core.java8.stream.concepts;

import java.util.List;
import java.util.stream.Stream;

public class AlphabetsConversionTest {

	public static void main(String[] args) {
		//create alphabets stream
		List<String> alphabets = Stream.of("a", "b", "c", "d", "e").toList();
		System.out.println("Lowercase Alphabets");
		alphabets.forEach(System.out::println);
		
		System.out.println("Uppercase Alphabets");
		List<String> uppercaseAlphabets = alphabets.stream().map(String::toUpperCase).toList();
		uppercaseAlphabets.forEach(System.out::println);
		uppercaseAlphabets.forEach(alpha -> System.out.println("Uppercase Letter: " + alpha));
	}
}
