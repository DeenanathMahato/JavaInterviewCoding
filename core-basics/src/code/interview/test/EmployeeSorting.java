package code.interview.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSorting {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1L, "Mk", 50000.0);
		Employee emp2 = new Employee(2L, "DK", 100000.0);
		Employee emp3 = new Employee(3L, "Anu", 20000.0);
		Employee emp4 = new Employee(4L, "Jan", 30000.0);
		Employee emp5 = new Employee(5L, "Sonu", 60000.0);

		List<Employee> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);

		//sorting employee such as employee name should be in descending order
		Collections.sort(employees, new MyComparator());

		employees.forEach(System.out::println);
	}
}

class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp2.getName().compareTo(emp1.getName());
	}
}

class Employee {
	private Long id;

	private String name;

	private Double salary;

	public Employee() {
		super();
	}

	public Employee(Long id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
