package application;

import entitites.Client;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Client client1 = new Client("Maria", "maria@gmail.com");
		Client client2 = new Client("Maria", "Karia@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		
		System.out.println(client1.equals(client2));
		System.out.println(client1 == client2);
		System.out.println(s1 == s2);
		
	
	}
}
