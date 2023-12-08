
public class Circle extends Hinh {
	private double r;
	
	public Circle(Coordinates coordinates, double r) {
		super(coordinates);
		this.r = r;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public double theArea() {
		return Math.PI * this.r * this.r;
	}

}
