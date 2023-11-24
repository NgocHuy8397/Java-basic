
public class Movie {
	private String movieName;
	private int yearOfManufacture;
	private Manufacturer manufacturer;
	private double fare;
	private Date showDate;
	
	public Movie(String movieName, int yearOfManufacture, Manufacturer manufacturer, double fare, Date showDate) {
		this.movieName = movieName;
		this.yearOfManufacture = yearOfManufacture;
		this.manufacturer = manufacturer;
		this.fare = fare;
		this.showDate = showDate;
	}
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	public Boolean checkOutCheaperFares(Movie otherMovie) {
		return this.fare < otherMovie.fare;
	}
	
	public String getNameManufuacturer() {
		return this.manufacturer.getManufacturerName();
	}
	
	public double priceAfterSale(double x) {
		return this.fare * ((100 - x)/100);
	}
	
}
