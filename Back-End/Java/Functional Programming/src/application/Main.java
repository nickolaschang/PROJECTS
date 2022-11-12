package application;

import entities.Product;
import services.ProductService;


import java.util.ArrayList;

import java.util.List;


public class Main {
	public static void main(String[] args) {
		
		ProductService productService = new ProductService();
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv - 1 ", 1500.0));
		list.add(new Product("Notebook - 2 ", 450.0));
		list.add(new Product("Tablet - 3 ", 900.0));
		list.add(new Product("Mouse - 4 ", 50.0));
		list.add(new Product("Cable - 5 ", 15.0));
		list.add(new Product("HD Case - 6 ", 90.0));
		
		
		double productSum = productService.productFilterSum(list, product -> product.getPrice() > 100.0);
		System.out.println("Total: $" + productSum);
		
		
	}
}