package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
    
        System.out.print("Enter the number of tax payers: ");
        int N = sc.nextInt();
    
        for (int i = 0; i < N; i++) {
        
            System.out.print("Individual or Company: (i/c) ");
            char type = sc.next().charAt(0);
        
            if (type == 'c') {
            
                System.out.print("Name: ");
                String name = sc.next();
            
                System.out.print("Annual Income: $");
                double annualIncome = sc.nextDouble();
            
                System.out.print("Number of Employees: ");
                int employees = sc.nextInt();
            
                list.add(new Company(name, annualIncome, employees));
            } else if (type == 'i') {
            
                System.out.print("Name: ");
                String name = sc.next();
            
                System.out.print("Annual Income: $");
                double annualIncome = sc.nextDouble();
            
                System.out.print("Health Expenditures: $");
                double healthExpenditures = sc.nextDouble();
            
                list.add(new Individual(name, annualIncome, healthExpenditures));
            }
        }
    
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer taxPayer : list) {
            System.out.println(taxPayer.getName() + " $" + String.format("%.2f", taxPayer.tax()));
        }
        
        System.out.println();
        double sum = 0;
        for (TaxPayer taxPayer : list) {
            sum += taxPayer.tax();
        }
        System.out.println("TOTAL TAXES $" + sum);
    }
}

        
        
            


