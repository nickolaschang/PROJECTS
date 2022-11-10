package application;

import services.PrintService;

import java.lang.reflect.Type;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService printService = new PrintService();
		
		System.out.print("How many values? ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			Object value = sc.nextLine();
			printService.addValue(value);
		}
		printService.print();
		System.out.println("First: " + printService.first());
		
		
		sc.close();
	}
}