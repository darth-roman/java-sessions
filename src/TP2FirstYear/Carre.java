package TP2FirstYear;


/*
 * PLEASE CHECK THE "Cercle.java" FOR EXPLANATION 
 */

public class Carre {
	double length;
	
	// Calculate the PERIMETER
	double calculatePerimeter() {
		return 4*length;
	}
	
	// Calculate the AREA
	double calculateArea() {
		return Math.pow(length, 2);
	}
}
