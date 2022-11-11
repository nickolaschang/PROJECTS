package application;

import com.sun.source.tree.Tree;
import entities.Product;

import java.nio.charset.CharacterCodingException;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Set<Product> products = new HashSet<>();
		products.add(new Product("TV", 900.0));
		products.add(new Product("Notebook", 1650.0));
		products.add(new Product("Tablet", 400.0));
		
		Product product = new Product("Notebook", 1650.0);
		
		System.out.println(products.contains(product));
		
	}
}