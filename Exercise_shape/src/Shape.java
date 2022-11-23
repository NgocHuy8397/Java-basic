
public class Shape {
	private String Triangle;
	private String Circle;
	private String Rectangle;
	private String Square;
	
	public Shape(String triangle, String circle, String rectangle, String square) {
		this.Triangle = triangle;
		this.Circle = circle;
		this.Rectangle = rectangle;
		this.Square = square;
	}

	public String getTriangle() {
		return Triangle;
	}

	public void setTriangle(String triangle) {
		this.Triangle = triangle;
	}

	public String getCircle() {
		return Circle;
	}

	public void setCircle(String circle) {
		this.Circle = circle;
	}

	public String getRectangle() {
		return Rectangle;
	}

	public void setRectangle(String rectangle) {
		this.Rectangle = rectangle;
	}

	public String getSquare() {
		return Square;
	}

	public void setSquare(String square) {
		this.Square = square;
	}
	
	public static void main(String[] args) {
		String[] shape = {"Triangle", "Circle", "Rectangle", "Square"};
		for(int i=0; i < shape.length; i++) {
			System.out.println(i+": "+shape[i]);
		}
		
	}
}
