package application;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService interestService = new BrazilInterestService(2.0);
		double payment = interestService.payment(amount, months);
		
		System.out.print("Payment after " + months + " months: ");
		System.out.println(String.format("%.2f", payment));
		
		InterestService interestServiceUsa = new UsaInterestService(1.0);
		double paymentUsa = interestServiceUsa.payment(amount, months);
		System.out.print("Payment after " + months + " months: ");
		System.out.println(String.format("%.2f", paymentUsa));
		sc.close();
	}
}