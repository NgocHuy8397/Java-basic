
public class Rectangle extends Hinh {
	private double height, width;
	
	public Rectangle(Coordinates coordinates, double height, double width) {
		super(coordinates);
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double theArea() {
		return this.height * this.width;
	}



	
}
