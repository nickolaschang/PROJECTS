import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		exceptionMethodMain();
		System.out.println("Program will now terminate");
		
		
  }
  public static void exceptionMethodMain(){
	  System.out.println("******Exception Main Method Running *****");
	  exceptionMethod();
	  System.out.println("******Exception Main Method Finished*****");
  }
  
  public static void exceptionMethod(){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("******Exception Method Start*****");
	  try {
		  String[] vect = sc.nextLine().split(" ");
		  int position = sc.nextInt();
		  System.out.println(vect[position]);
		
	  }
	  catch(ArrayIndexOutOfBoundsException error){
		  System.out.print("Invalid Position");
		  error.printStackTrace();
		  sc.next();
	  }
	  catch (InputMismatchException Error){
		  System.out.print("Invalid Input");
	  }
	  sc.close();
  }
  
}