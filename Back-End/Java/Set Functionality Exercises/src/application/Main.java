package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Log File Full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<LogEntry> logSet = new HashSet<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] lines = line.split(" ");
				String username = lines[0];
				Date moment = Date.from(Instant.parse(lines[1]));
				
				logSet.add(new LogEntry(username, moment));
				
				line = br.readLine();
			}
			System.out.println("Total unique users: " + logSet.size());
			
		} catch (IOException error) {
			System.out.println("Error:" + error.getMessage());
		}
		
		sc.close();
	}
}