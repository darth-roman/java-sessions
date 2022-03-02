package TP2FirstYear;

/*
 * PLEASE CHECK THE "Cercle.java" FOR EXPLANATION 
 */

public class Rectangle {
	// in this case we will define the Rectangle class by a double length and double height
	double length;
	double width;
	
	// Here we will define two methods (1 to calculate the PERIMETER and the other to calculate the AREA
	
	// Calculate the PERIMETER
	double calculatePerimeter() {
		return 2*(length + width);
	}
	
	// Calculate the AREA
	double calculateArea() {
		return length*width;
	}
}
