package TP2;

public class Main {
	public static void main(String args[]) {
		Student s1 = new Student();
		s1.name = "John Doe";
		s1.age= 25;
		
		int a = 0;
		
		
		Animal animal1 = new Animal();

		//Animal animal2 = new Animal("Domestic", "House", 40f, "Desert");
		
		System.out.println("I weigh "+animal1.weight+" And i live in "+animal1.placeOfLiving);
	}
}
