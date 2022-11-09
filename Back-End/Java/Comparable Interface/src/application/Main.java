package application;

import entitites.Employee;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter File path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			for (Employee employee : list) {
				System.out.println(employee.getName() + ", " + employee.getSalary());
			}
		} catch (IOException error) {
			System.out.println("Error" + error.getMessage());
		}
		
		
		sc.close();
	}
}