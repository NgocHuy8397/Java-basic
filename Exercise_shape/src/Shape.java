
public class Shape {
	private double Triangle;
	private double Circle;
	private double Rectangle;
	private double Square;
	
	public Shape(double triangle, double circle, double rectangle, double square) {
		this.Triangle = triangle;
		this.Circle = circle;
		this.Rectangle = rectangle;
		this.Square = square;
	}
	
	public double getTriangle() {
		return Triangle;
	}
	public void setTriangle(double triangle) {
		this.Triangle = triangle;
	}
	public double getCircle() {
		return Circle;
	}
	public void setCircle(double circle) {
		this.Circle = circle;
	}
	public double getRectangle() {
		return Rectangle;
	}
	public void setRectangle(double rectangle) {
		this.Rectangle = rectangle;
	}
	public double getSquare() {
		return Square;
	}
	public void setSquare(double square) {
		this.Square = square;
	}
	
	public double areaTriangle(double a, double b, double c) {
		double p = (a + b + c) / 2 ; 
		return Math.sqrt(p*(p - a) * (p - b) * (p - c));
	} 
	
	public double areaCircle(double a ) {
		return Math.PI * Math.pow(a, 2);
	}
	
	public double areaRectangle(double a, double b) {
		return a * b;
	}
	
	
}
