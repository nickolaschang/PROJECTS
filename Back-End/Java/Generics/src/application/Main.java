package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * List<Object>obj = new ArrayList<>();
		 * List<Integer>number = new ArrayList<>();
		 * obj = number;
		 *
		 * Compilation error, a List of Object can contain Integer, but a List of Integer cannot be a List of Object.
		 */
		
		/*
		 * List<?>obj = new ArrayList<>();
		 * List<Integer>number = new ArrayList<>();
		 * obj = number;
		 *
		 * This works because we are now using the wildcard generic type <?>
		 */
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Alex", "Maria", "Bob");
		printList(myStrs);
	}
	
	public static void printList(List<?> list) {
		// list.add(3) <- remove // to test
		// wouldn't work, because the compiler cannot know what type of list it is going
		// to be added (<?> type), therefore it catches the error beforehand.
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
