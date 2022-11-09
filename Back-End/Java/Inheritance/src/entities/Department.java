package entities;

import java.util.ArrayList;

import java.util.List;

public class Department {
	private String name;
	private int payDay;

	public List<Employee> employeeList = new ArrayList<>();

	public Department() {
	}

	public Department(String name, int payDay) {
		super();
		this.name = name;
		this.payDay = payDay;
	}

	public Department(String name, int payDay, Employee employee) {
		super();
		this.name = name;
		this.payDay = payDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employeeList.remove(employee);
	}

	public double payroll() {
		double sum = 0;
		for (Employee employee : employeeList) {
			sum += employee.getSalary();
		}
		return sum;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	

}
