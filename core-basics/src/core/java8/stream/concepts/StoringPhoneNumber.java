package core.java8.stream.concepts;

import java.util.Arrays;
import java.util.List;

//using flatMap for flattering the datas
public class StoringPhoneNumber {

	public static void main(String[] args) {
		//without using flatMap
		List<Employee> employeeList = Arrays.asList(new Employee(1, "Deenu", 50000.0, List.of("9108405536", "9661813179")),
				new Employee(2, "Mk", 40000.0, List.of("9108405538", "9661813180")),
				new Employee(3, "Dk", 60000.0, List.of("9108405539", "9661813181")));
		List<List<String>> phones = employeeList.stream().map(Employee::getPhoneNumbers).toList();
		System.out.println(phones);

		//using flatMap
		List<Employee> employees = Arrays.asList(new Employee(1, "Deenu", 50000.0, List.of("9108405536", "9661813179")),
				new Employee(2, "Mk", 40000.0, List.of("9108405538", "9661813180")),
				new Employee(3, "Dk", 60000.0, List.of("9108405539", "9661813181")));
		List<String> phoneNumbers = employees.stream().flatMap(emp -> emp.getPhoneNumbers().stream()).toList();
		System.out.println(phoneNumbers);
		phoneNumbers.forEach(System.out::println);
	}
}
