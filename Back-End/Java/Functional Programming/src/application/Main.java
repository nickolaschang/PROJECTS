package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv - 1", 1500.0));
		list.add(new Product("Notebook - 2", 450.0));
		list.add(new Product("Tablet - 3", 900.0));
		
		Comparator<Product> comp = (product1,product2) -> {
			return product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
		};
		
		list.sort(comp);
		
		for (Product product : list){
			System.out.println(product);
		}
		
	}
}