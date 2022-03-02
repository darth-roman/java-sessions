package TP2;

public class Point {
	private double x, y;
	public Point() {
		
	}
	


	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	double pointSymY() {
		return -this.y; 
	}
	
	double pointSymX() {
		return -this.x; 
	}
	double pointSymX(double x) {
		return -this.x; 
	}
}
