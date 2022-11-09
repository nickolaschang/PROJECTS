package application;

import entities.Contract;
import entities.ContractService;
import entities.Instalment;
import services.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Enter contract data: ");
		
		System.out.print("Contract Number: ");
		int contractNumber = sc.nextInt();
		
		System.out.print("Enter Contract Data (dd/mm/yyyy): ");
		LocalDate contractDate = LocalDate.parse(sc.next(), dateFormat);
		
		System.out.print("Contract Value: ");
		double contractValue = sc.nextDouble();
		
		Contract contract = new Contract(contractNumber, contractDate, contractValue);
		
		System.out.print("Enter the quantity of installments for the payment: ");
		int instalmentQuantity = sc.nextInt();
		
		ContractService contractService = new ContractService(new PayPalService());
		contractService.processContract(contract, instalmentQuantity);
		
		
		System.out.println("Instalments: ");
		for (Instalment instalment : contract.getInstalments()){
			System.out.println(instalment);
		}
		
		sc.close();
	}
}
		
		



