package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv - 1 ", 1500.0));
		list.add(new Product("Notebook - 2 ", 450.0));
		list.add(new Product("Tablet - 3 ", 900.0));
		list.add(new Product("Mouse - 4 ", 50.0));
		list.add(new Product("Cable - 5 ", 15.0));
		list.add(new Product("HD Case - 6 ", 90.0));
		
		
		List < String > names = list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());
        //List < String > names = list.stream().map(function).collect(Collectors.toList());
		//List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		//List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		names.forEach(System.out::println);
		
		
	}
}