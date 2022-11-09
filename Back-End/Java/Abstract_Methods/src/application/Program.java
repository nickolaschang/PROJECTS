package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Shape #" + (i + 1) + " data:");

            System.out.print("Rectangle or Circle? (r/c): ");
            char form = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next().toUpperCase());

            if (form == 'r') {

                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                list.add(new Rectangle(width, height, color));

            } else if (form == 'c') {

                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                list.add(new Circle(color, radius));
            }
        }
        System.out.println("SHAPE AREAS:");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f",shape.area()));

            sc.close();
        }
    }
}