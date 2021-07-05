package polygons;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	// ---Global Scope
	static ArrayList<Polygon> polygon = new ArrayList<Polygon>();
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Fill a Polygon	
		fillPolygon();
		
		//Show data and each polygon area
		showData();
	}
	
	public static void fillPolygon() {
		char answer;
		int option;
		do {
			do {
				System.out.println("Choice a polygon");
				System.out.println("1. Triangle");
				System.out.println("2. Rectangle");
				System.out.println("Option: ");
				option = input.nextInt();
				
			}while(option<1 || option >2);
			
			switch(option) 
			{
			case 1: // Triangle
				fillTriangle();
				break;
			case 2: // Rectangle
				fillRectangle();
				break;
			}
			
			System.out.println("\nAnother Polygon ? (y/n):");
			answer = input.next().charAt(0);
			System.out.println("");
			
		}while(answer == 'y' || answer == 'Y');
	}

	public static void fillTriangle() {
		double side1, side2, side3;
		
		System.out.println("Triangle");
		System.out.println("Input side 1: ");
		side1 = input.nextDouble();
		
		System.out.println("Input side 2: ");
		side2 = input.nextDouble();
		
		System.out.println("Input side 3: ");
		side3 = input.nextDouble();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		
		//Polymorphism
		polygon.add(triangle);
		
	}
	
	public static void fillRectangle() {
		double side1, side2;
		
		System.out.println("Rectangle");
		System.out.println("Input side 1: ");
		side1 = input.nextDouble();
		
		System.out.println("Input side 2: ");
		side2 = input.nextDouble();
		
		Rectangle rectangle = new Rectangle(side1, side2);
		polygon.add(rectangle);
	}

	public static void showData() {
		for(Polygon poli : polygon) {
			////Polymorphism
			System.out.println(poli.toString());
			System.out.println("Area= "+ poli.area());
			System.out.println("");
		}
	}
}

