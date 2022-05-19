package core.java8.stream.concepts;

import java.util.List;
import java.util.stream.Stream;

public class MapperTest02 {

	public static void main(String[] args) {
		// stream of customers
		List<Customer> customers = Stream.of(new Customer(1, "Ashok", 10000.0f, "ashok@gmail.com"),
				new Customer(2, "Mk", 20000.0f, "mk@gmail.com"),
				new Customer(3, "dk", 30000.0f, "dk@gmail.com"),
				new Customer(4, "gk", 40000.0f, "gk@gmail.com"),
				new Customer(5, "pk", 50000.0f, "pk@gmail.com")).toList();

		System.out.println("================= Using Lambda Expression ================");
		
		// collect email id of each customer using lambda expression
		List<String> emailIds = customers.stream().map(customer -> customer.getEmailId()).toList();
		emailIds.forEach(System.out::println);
		
		System.out.println("================= Using Method Reference ================");
		// collect email id of each customer using method reference
		List<String> emailList = customers.stream().map(Customer::getEmailId).toList();
		emailList.forEach(System.out::println);
		
		//find all customer names whose salary is greater than or equal to 30000.0 using filter
		List<String> customerList = customers.stream().filter(customer -> customer.getSalary() >= 30000.0)
				.map(Customer::getName).toList();
		System.out.println("\nCustomer Names whose salary is greater or equal to 30000.0");
		customerList.forEach(System.out::println);
	}
}

class Customer {

	private int id;

	private String name;

	private float salary;

	private String emailId;

	public Customer(int id, String name, float salary, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", salary=" + salary + ", emailId=" + emailId + "]";
	}

}
