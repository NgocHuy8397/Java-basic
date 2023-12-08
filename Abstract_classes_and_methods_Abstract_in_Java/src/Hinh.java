
public abstract class Hinh {
	protected Coordinates coordinates;

	public Hinh(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	
	public abstract double theArea();
	
	
}
