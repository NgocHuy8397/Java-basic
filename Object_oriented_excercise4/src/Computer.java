import java.util.Objects;

public class Computer {
	private Manufacturer manufacturer;
	private Nation nation;
	private double Price;
	private double WarrantyPeriod;
	
	public Computer(Manufacturer manufacturer, Nation nation, double price, double warrantyPeriod) {
		this.manufacturer = manufacturer;
		this.nation = nation;
		Price = price;
		WarrantyPeriod = warrantyPeriod;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Nation getNation() {
		return nation;
	}

	public void setNation(Nation nation) {
		this.nation = nation;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public double getWarrantyPeriod() {
		return WarrantyPeriod;
	}

	public void setWarrantyPeriod(double warrantyPeriod) {
		WarrantyPeriod = warrantyPeriod;
	}
	
	public Boolean CheckOutLowerPrices(Computer computer ) {
		return this.Price <= computer.Price;
	}
	
	public String getCountryName() {
		return this.manufacturer.getManufacturerName();
	}

	@Override
	public int hashCode() {
		return Objects.hash(Price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		return Double.doubleToLongBits(Price) == Double.doubleToLongBits(other.Price);
	}
	
}
