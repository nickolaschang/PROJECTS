package application;

import model.entities.Product;

import java.io.File;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path to list: ");
		String pathInput = sc.nextLine();
		
		File filepath = new File(pathInput);
		
		File[] folders = filepath.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for (File folder : folders){
			System.out.println(folders);
		}
		System.out.println("list end");
		System.out.println();
		
		File[] files = filepath.listFiles(File::isFile);
		System.out.println("FILES: ");
		for (File file : files){
			System.out.println(files);
		}
		System.out.println("list end");
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}