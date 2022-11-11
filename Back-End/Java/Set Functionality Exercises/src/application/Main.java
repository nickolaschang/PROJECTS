package application;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> curso1 = new HashSet<>();
		Set<Integer> curso2 = new HashSet<>();
		Set<Integer> curso3 = new HashSet<>();
		
		
		System.out.print("How many Students for course A: ");
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int number = sc.nextInt();
			curso1.add(number);
		}
		System.out.print("How many Students for course B: ");
		N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int number = sc.nextInt();
			curso2.add(number);
		}
		System.out.print("How many Students for course C: ");
		N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int number = sc.nextInt();
			curso3.add(number);
		}
		Set<Integer> total = new HashSet<>(curso1);
		total.addAll(curso2);
		total.addAll(curso3);
		
		System.out.println("Total Students: " + total.size());
		
		sc.close();
	}
}