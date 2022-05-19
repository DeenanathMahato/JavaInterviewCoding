package core.java8.stream.concepts;

import java.util.List;
import java.util.stream.Stream;

public class MapperTest01 {

	public static void main(String[] args) {
		/*
		 * List<String> lowercaseCharacters = new ArrayList<>();
		 * lowercaseCharacters.add("a"); lowercaseCharacters.add("b");
		 * lowercaseCharacters.add("c"); lowercaseCharacters.add("d");
		 * lowercaseCharacters.add("e");
		 */

		//this one is good practice than above
		List<String> lowercaseCharacters = Stream.of("a", "b", "c", "d", "e").toList();

		System.out.println("Lowercase Characters:");
		lowercaseCharacters.forEach(System.out::println);

		List<String> uppercaseCharacters = lowercaseCharacters.stream().map(String::toUpperCase).toList();
		uppercaseCharacters.forEach(System.out::println);

	}
}
