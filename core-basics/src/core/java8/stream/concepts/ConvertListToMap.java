package core.java8.stream.concepts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Java program for list convert  in map
//with the help of Collectors.toMap() method

public class ConvertListToMap {

	public static void main(String[] args) {
		List<Employee> employees = Stream.of(
				new Employee(1, "DN", 100000.0, List.of("12345", "56667")),
				new Employee(2, "MK", 10000.0, List.of("12346", "566668")),
				new Employee(3, "AK", 20000.0, List.of("12347", "566669"))).toList();
		
		//first approach
		//converting list of employee to map where employee id is key of map and employee object is value of map
		Map<Integer, Employee> map1 = employees.stream().collect(Collectors.toMap(Employee::getEmpId, Function.identity()));
		map1.forEach((k, v) -> System.out.println(k + "-" + v));
		
		Map<Integer, String> map2 = employees.stream().collect(Collectors.toMap(Employee::getEmpId, Employee::getEmpName, (k, v) -> k + ", " + v));
		map2.forEach((k, v) -> System.out.println(k + "-" + v));
		
		Map<Integer, String> map3 = employees.stream().collect(Collectors.toMap(Employee::getEmpId, Employee::getEmpName));
		map3.forEach((k, v) -> System.out.println(k + "---" + v));
	}
}
