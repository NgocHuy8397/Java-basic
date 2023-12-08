
public abstract class Transport {
	protected Manufacturer manufacturer;
	protected String tenLoaiPhuongTien;
	
	public Transport(Manufacturer manufacturer, String tenLoaiPhuongTien) {
		this.manufacturer = manufacturer;
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getTenLoaiPhuongTien() {
		return tenLoaiPhuongTien;
	}

	public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
	}

	public String nameManufacturer() {
		return this.manufacturer.getTenHangSanXuat();
	}
	
	public void start() {
		System.out.println("Start");
	}
	
	public void acceleration() {
		System.out.println("Acceleration");
	}
	
	public void stop() {
		System.out.println("Stop");
	}
	
	public abstract double getTheVelocity();
}
