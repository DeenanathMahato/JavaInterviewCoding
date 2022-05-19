package core.java8.stream.concepts;

import java.util.List;

public class Employee {

	private int empId;

	private String empName;

	private Double salary;

	private List<String> phoneNumbers;

	public Employee(int empId, String empName, Double salary, List<String> phoneNumbers) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.phoneNumbers = phoneNumbers;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", phoneNumbers="
				+ phoneNumbers + "]";
	}
}
