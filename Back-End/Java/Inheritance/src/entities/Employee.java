package entities;

public class Employee {
	private String name;
	private double salary;
		
	public Employee() {

	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public double setSalary(double salary) {
		return this.salary = salary;
	}

}
