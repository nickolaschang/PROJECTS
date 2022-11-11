package application;

import entities.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3, 2));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2));
		myCircles.add(new Circle(3));
		
		List<Rectangle> myRectangles = new ArrayList<>();
		myRectangles.add(new Rectangle(2, 6));
		myRectangles.add(new Rectangle(3, 8));
		
		
		System.out.println("Total area Shapes: " + String.format("%.2f", totalArea(myShapes)));
		System.out.println("Total area Circles: " + String.format("%.2f", totalArea(myCircles)));
		System.out.println("Total area Rectangles: " + String.format("%.2f", totalArea(myRectangles)));
	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0;
		for (Shape shape : list) {
			sum += shape.area();
		}
		return sum;
	}
}
