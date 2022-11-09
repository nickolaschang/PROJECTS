package application;

import devices.Printer;
import devices.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Printer printer = new Printer("1080");
		printer.processDoc("My letter");
		printer.print("My letter");
		
		Scanner scanner = new Scanner("2003");
		scanner.processDoc("My email");
		System.out.println("Scan Result: " + scanner.scan());
	}
}