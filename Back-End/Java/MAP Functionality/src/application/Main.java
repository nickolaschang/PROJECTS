package application;

import entities.Product;

import java.util.HashMap;
import java.util.Map;


public class Main {
	public static void main(String[] args) {
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 100.0);
		stock.put(p2, 200.0);
		stock.put(p3, 150.0);
		
		Product ps = new Product("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	}
}
		
		/*
		Map<String, String> cookies = new TreeMap<>();
		cookies.put("Username", "Maria");
		
		cookies.put("Email", "Maria@gmail.com");
		cookies.put("Phone", "426648456");
		
		cookies.put("Phone", "666498415"); // will overwrite the last same key and update with the new value
		
		System.out.println("Cookies: ");
		for (String cookie : cookies.keySet()) {
			System.out.println(cookie + ": " + cookies.get(cookie));
			
		}
		System.out.println("Contains phone key: " + cookies.containsKey("Phone"));
		System.out.println("Cookie table Size: " + cookies.size());
		*/
	
		