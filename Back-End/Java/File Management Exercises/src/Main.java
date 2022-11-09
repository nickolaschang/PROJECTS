import java.io.*;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a path to create a new folder: ");
		String newFolderPath = sc.nextLine();
		
		System.out.print("Now enter the folder name: ");
		String folderName = sc.nextLine();
		
		boolean created = new File(newFolderPath, folderName).mkdir();
		System.out.println("Folder created successfully!");
		
		try {
			System.out.print("What will be the file name? ");
			String fileName = sc.nextLine();
			
			System.out.print("What is going to be the extension? (txt, html, etc) ");
			String fileExtension = "." + sc.nextLine();
			
			System.out.println("Creating the file.. ");
			File file = new File(newFolderPath + folderName, fileName + fileExtension);
			if (!file.exists()) {
				System.out.println("creating file (...)");
				if (file.createNewFile()) {
					System.out.println("Successfully created file!");
				}
			}
			FileWriter fileChange = new FileWriter(file);
			System.out.print("How many lines will the new change have? ");
			int linesQuantity = sc.nextInt();
			String[] lines = new String[linesQuantity];
			sc.nextLine();
			
			for (String line : lines) {
				System.out.print("Type the new information to be added to the file: ");
				String[] changes = new String[]{sc.nextLine()};
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
					for (String change : changes) {
						bw.write(change);
						bw.newLine();
						System.out.println("Information saved successfully!");
					}
				}
			}
			
		} catch (IOException error) {
			System.out.println("Failed to create file: " + error.getMessage());
			error.printStackTrace();
		}
		
		sc.close();
		
	}
}


