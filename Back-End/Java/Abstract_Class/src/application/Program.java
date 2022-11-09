package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        /*Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());
        * -> Cannot be instantiated because it's now Abstract

        Account acc2 = new BusinessAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new SavingsAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
        */

        List<Account> list = new ArrayList<>(); // creating the list to loop between the classes

        list.add(new SavingsAccount(1001,"Alex",496.0,0.01));
        list.add(new BusinessAccount(1021,"Maria",322.0,400.0));
        list.add(new SavingsAccount(1041,"Bob",199.0,0.01));
        list.add(new BusinessAccount(1301,"Anna",687.0,500.0));

        double sum = 0.0;
        for (Account account : list){
            sum += account.getBalance();
        }
        System.out.printf("Total balance %.2f%n" , sum);

        for (Account account : list){
            account.deposit(500.0); // amount to be added to the subclasses
        }
        for (Account account : list){
            System.out.printf("Updated balance for account %d: $%.2f%n", account.getNumber(), account.getBalance());
        }
    }
}