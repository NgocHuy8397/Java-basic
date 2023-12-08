
public class Bicycle extends Transport{

	public Bicycle(Manufacturer manufacturer, String tenLoaiPhuongTien) {
		super(manufacturer, tenLoaiPhuongTien);
	}

	@Override
	public double getTheVelocity() {
		return 30;
	}
	
}
