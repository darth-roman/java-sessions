package TP2FirstYear;


/*
 * Class = Type
 * Here we are about to create a new type called "Cercle"
 * NOTE: By convention we start the first letter of the classes names with a capital case 
 	- Ex: "class Something" instead of "class something"
 */

public class Cercle {
	/*
	 * inside the class's body, we define some variables that
	 	defines the type "Cercle", and they are called **ATTRIBUTES**
	 * In this specific class, there are couple of attributes to be declared
	 	and it can depend on the programmer's reasoning and logic, also depends
	 	on the needs of the program
	 * The "Cercle" in this case is defined by its center's coordinates (x and y) and its diameter
	 	that are all having "double" type
	 	
	 
	 * NOTE: functions in Java are called METHODS by convention and they are declared under the camel case format
	 	meaning: thisIsAMethod(){...} first letter of each word except from the first word is typed with a capital case
	 	- Other formats are correct too, but its a good practice in general to follow the typing conventions
	 	- Other conventions tips are going to be demonstrated later
	 */
	
	double xCenter;
	double yCenter;
	double diameter;
	
	// This method(function) is to return the xCenter and yCenter of the Cercle
	String centerCoordinates() {
		return "X: "+xCenter+" Y:"+yCenter;
	}
	
	// This method(function) is to return the xCenter and yCenter of the Cercle
	String diameterValue() {
		return "Diameter: "+diameter;
	}
	
	// We can add two more to calculate each of the PERIMETER and AREA
	
	// Calculate the AREA
	double calculateArea() {
		
		/*
		 * Math is a predefined class that has some mathematics useful methods line sin and cos and some constants like PI
		 * Please check this link for more methods and variables
		 	LINK : https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
		 */
		
		
		return diameter*diameter*Math.PI;
	}
	
	// Calculate the AREA
	double calculatePerimeter() {
		return diameter*Math.PI;
	}

}
