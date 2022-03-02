package TP2FirstYear;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This part is for declarations 
		// We will declare a Scanner, and some geometric shapes that we defined
		
			//Scanner
		Scanner sc = new Scanner(System.in);
			// Our Geometric shapes
		// In order to do that, we follow this syntax
		// Type objectName = new Type(args); noting that a Type is a class so we just need to type a class name
		// Like what we've done below 
		Cercle c1 = new Cercle();
		Rectangle r1 = new Rectangle();
		Carre car1 = new Carre();
		
		
		
		// This section is for scanning the values of each geometric shape
		//Cercle c1 values:
		System.out.println("Please enter the Cercle\'s coordinates x and y and diameter");
		System.out.print("X >> ");
		c1.xCenter = sc.nextDouble();
		System.out.print("Y >> ");
		c1.yCenter = sc.nextDouble();
		System.out.print("Diameter >>");
		c1.diameter = sc.nextDouble();
		
		//Rectangle r1 values:
		System.out.println("Please enter the Rectangle\'s length and width");
		System.out.print("Lenght >> ");
		r1.length = sc.nextDouble();
		System.out.print("Width >> ");
		r1.width = sc.nextDouble();
		
		//Rectangle r1 values:
		System.out.println("Please enter the Carre\'s length");
		System.out.print("Lenght >> ");
		car1.length = sc.nextDouble();
		
		
		
		// This section will be used to show call the methods that we defines in each class
		
		// Cercle methods
		System.out.println("CERCLE");
			// Cercle Center Coords and diameter
		System.out.println(c1.centerCoordinates());
		System.out.println(c1.diameterValue());
			// Cercle Perimeter and Area
		System.out.println("The Perimeter is: "+c1.calculatePerimeter());
		System.out.println("The Area is: "+c1.calculateArea());
		
		// Rectangle methods
		System.out.println("RECTANGLE");
			// Rectangle Perimeter and Area
		System.out.println("The Perimeter is: "+r1.calculatePerimeter());
		System.out.println("The Area is: "+r1.calculateArea());
		
		
		// Carre methods
		System.out.println("CARRE");
			// Carre Perimeter and Area
		System.out.println("The Perimeter is: "+car1.calculatePerimeter());
		System.out.println("The Area is: "+car1.calculateArea());
		
	}

}
