package application;

import entities.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\PROJETOS\\Back-End\\Java\\Generics\\test.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			Product x = CalculationService.max(list);
			System.out.print("Highest value: ");
			System.out.println(x);
			
			
		} catch (IOException e) {
			System.out.println("Error reading your file. " + e.getMessage());
		}
		
		
	}
}
