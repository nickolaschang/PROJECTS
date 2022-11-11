package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> votes = new LinkedHashMap<>();
		
		
		System.out.print("Enter file Full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			
			String line = bufferedReader.readLine();
			while (line != null) {
				String[] lines = line.split(",");
				String name = lines[0];
				int count = Integer.parseInt(lines[1]);
				
				if (votes.containsKey(name)) {
					int votesQuantity = votes.get(name);
					votes.put(name, count + votesQuantity);
				} else {
					votes.put(name, count);
				}
				line = bufferedReader.readLine();
			}
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			
		} catch (IOException error) {
			System.out.println("Error: " + error.getMessage());
		}
		sc.close();
	}
}