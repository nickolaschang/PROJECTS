package application;

import model.entities.Account;
import model.exceptions.DomainExceptions;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inform Account data: ");
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: $");
		double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: $");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		System.out.println();
		
		System.out.print("Please, what is the withdraw amount? $");
		
		try {
			account.validateWithdraw(sc.nextDouble());
			System.out.println("Updated Balance: $" + String.format("%.2f", account.getBalance()));
		} catch (DomainExceptions error) {
			System.out.println(error.getMessage());
		}
		sc.close();
	}
}