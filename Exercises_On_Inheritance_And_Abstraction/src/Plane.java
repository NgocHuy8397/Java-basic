
public class Plane extends Transport {
	
	private String fuelType;

	public Plane(Manufacturer manufacturer, String tenLoaiPhuongTien, String fuelType) {
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
		return 500;
	}
	
	public void catCanh() {
		System.out.println("_________-___________");
	}
	
	public void haCanh() {
		System.out.println("______________________");
	}
	
}
