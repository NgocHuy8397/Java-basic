
public class Car extends Transport{
	private String fuelType;

	public Car(Manufacturer manufacturer, String tenLoaiPhuongTien, String fuelType) {
		super(manufacturer, tenLoaiPhuongTien);
		this.fuelType = fuelType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public double getTheVelocity() {
		return 100;
	}
	
	
}
