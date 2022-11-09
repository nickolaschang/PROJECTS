import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		File file = new File("C:\\PROJETOS GIT\\Java\\Java-Study\\Study Project Finally Block Exception\\testFile" +
				                     ".txt"); // change testFile to testFile1 to test the exception throw
		
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} // Exception test happening here
		catch (FileNotFoundException error) {
			System.out.println("Error opening file: Not Found -> " + error.getMessage());
		}
		finally { // Exception Closing the file, if successfully opened
			if (sc != null) {
				sc.close();
			}
			System.out.println("*** Finally Block Successfully executed ***");
		}
	}
}