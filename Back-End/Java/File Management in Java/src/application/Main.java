package application;

import javax.sound.midi.SysexMessage;
import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName Method invoke: " + path.getName());
		
		System.out.println("getParent Method invoke: " + path.getParent());
		
		System.out.println("getPath Method invoke: " + path.getPath());
		
		sc.close();
		
		
	}
}
	
	

