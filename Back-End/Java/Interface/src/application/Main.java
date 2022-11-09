package application;

import model.entities.CarRental;
import model.entities.Invoice;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rental data:");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.print("Pickup date (dd/MM/yyyy hh:mm): ");
		LocalDateTime pickupDate = LocalDateTime.parse(sc.nextLine(), dateFormat);
		
		System.out.print("Return date (dd/MM/yyyy hh:mm): ");
		LocalDateTime returnDate = LocalDateTime.parse(sc.nextLine(), dateFormat);
		
		CarRental carRental = new CarRental(pickupDate,returnDate,new Vehicle(carModel));
		
		
		System.out.println();
		System.out.print("Enter price per Hour: $");
		double pricePerHour = sc.nextDouble();
		
		System.out.print("Enter price per Day: $");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(carRental);
		System.out.println();
		
		System.out.println("Invoice: ");
		System.out.println("Basic Payment: " + String.format("%.2f",carRental.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f",carRental.getInvoice().getTax()));
		System.out.println("Total Payment: " + String.format("%.2f",carRental.getInvoice().totalPayment()));
		
		sc.close();
		
		
	}
}