package core.java8.stream.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TotalEmployeeSalary {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Deenu", 50000.0, List.of("9108405536", "9661813179")),
				new Employee(2, "Mk", 40000.0, List.of("9108405538", "9661813180")),
				new Employee(3, "Dk", 60000.0, List.of("9108405539", "9661813181")));
		//using lambda expression
		Double totalEmployeeSalary = employees.stream().map(emp -> emp.getSalary()).reduce(0.0, (n1, n2) -> n1 + n2);
		System.out.println("Total Employee Salary1: " + totalEmployeeSalary);
		
		//using method reference ::
		Double totalEmpSalary = employees.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
		System.out.println("Total Employee Salary2: " + totalEmpSalary);
		
		Double sum = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("Sum: " + sum);
		
		Optional<Double> minimumSalary = employees.stream().map(Employee::getSalary).reduce(Double::min);
		if(minimumSalary.isPresent())
			System.out.println("Minimum Salary: " + minimumSalary.get());
		else
			System.out.println("There is no result");
		
		long totalEmpl = employees.stream().count();
		System.out.println("Total Number of Employee using count: " + totalEmpl);
		System.out.println("Total Number of Employee using size: " + employees.size());
		
		//best use case of count
		long count = employees.stream().filter(emp -> emp.getSalary() >= 50000.0).count();
		System.out.println("Number of employee whose salary is >= 50000.0 : " + count);
		
	}
}
