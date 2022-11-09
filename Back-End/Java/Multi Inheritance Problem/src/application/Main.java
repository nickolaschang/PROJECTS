package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Main {
	public static void main(String[] args) {
		
		ConcretePrinter concretePrinter = new ConcretePrinter("1080");
		concretePrinter.processDoc("My letter");
		concretePrinter.print("My letter");
		System.out.println();
		
		ConcreteScanner concreteScanner = new ConcreteScanner("2003");
		concreteScanner.processDoc("My email");
		System.out.println("Scan Result: " + concreteScanner.scan());
		System.out.println();
		
		ComboDevice comboDevice = new ComboDevice("2081");
		comboDevice.processDoc("TESTCOMBO");
		comboDevice.print("TESTCOMBOPRINT");
		System.out.println("Scan Result: " + comboDevice.scan());
	}
}