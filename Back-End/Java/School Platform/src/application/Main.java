package application;

import entities.Lesson;
import entities.Task;
import entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Lesson>list = new ArrayList<>();
		
		System.out.print("How many classes to this course: "); // Enter how many classes this student will have in his current course
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println((i+1)+ "# Class data: ");
			
			System.out.print("What is the type of study, video or Task? (v/t): ");
			char type = sc.next().charAt(0);
			
			if (type == 'v'){
				System.out.print("Class' title: "); // Name the class
				sc.nextLine();
				String title = sc.nextLine();
				
				System.out.print("Video's URL: "); // Give a URL for the current class
				String videoUrl = sc.next();
				
				System.out.print("Duration in minutes: ");
				int minutes = sc.nextInt();
				/* As per the project UML the duration should be in seconds, hence the class attribute in Class Video is *seconds*
				 but that would be too clunky, so, for study purposes I decided to change to minutes.*/
				
				list.add(new Video(title,videoUrl,minutes));
				
			} else if( type == 't') {
				System.out.print("Class' title: ");
				sc.nextLine();
				String title = sc.nextLine();
				
				System.out.print("Description: "); // Now instead of a URL, we are giving a description, because it's no longer a Video
				String description = sc.nextLine();
				
				System.out.print("Amount of questions: ");
				int questionCount = sc.nextInt();
				// The current amount of questions this class will have
				
				list.add(new Task(title, description, questionCount));
			}
		}
		
		System.out.println();
		double minutesSum = 0; // Local variable to calculate the sum of the time
		
		for (Lesson lesson : list){
			minutesSum += lesson.duration();
			/* For loop to search through the <List> list that we created
			where (Lesson -> Class / lesson -> the method call variable / : list -> our list */
		}
		System.out.println("Total duration of the course: " + minutesSum + " minutes");
		
		sc.close();
	}
	
	
}
