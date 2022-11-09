package application;

import model.entities.Reservation;
import model.exceptions.DomainExceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.print("Room Number: ");
			int roomNumber = sc.nextInt();
			
			System.out.print("Check-in date (dd/mm/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
		/* Parse method can lead to an exception, therefore "throws
		   ParseException" will not be handled by Main methodbut now it is going to be
		   handled by our customized throw exception */
			System.out.print("Check-out date (dd/mm/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation); // Handled by toString in Reservation Class
			System.out.println();
			
			System.out.println("Enter date to update the Reservation: ");
			
			System.out.print("Check-in date (dd/mm/yyyy): ");
			checkIn = sdf.parse(sc.next());
			
			System.out.print("Check-out date (dd/mm/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
		} catch (ParseException error) {
			System.out.println("Invalid Date Format, try 22/22/2222, maybe you have used Letters or special " +
					                   "characters? (*/!@#$%)");
		} catch (DomainExceptions error) {
			System.out.println(error.getMessage());
		}
		
		sc.close();
	}
}