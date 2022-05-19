package core.java8.stream.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		//this is basic supplier implementation
		Supplier<String> supplier = () -> "Hello this is supplier demo!";
		System.out.println(supplier.get());
		
		//this is an example of supplier by pass supplier as reference
		List<String> names = Arrays.asList("Deenu", "Dk");
		System.out.println(names.stream().findAny().orElseGet(supplier));
		
		//this is an example of supplier by direct implementation using lambda expression
		List<String> phones = Arrays.asList();
		System.out.println(phones.stream().findAny().orElseGet(() -> "No Data Present!"));
		
	}
}
