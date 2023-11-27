
public class Manufacturer {
	private String ManufacturerName;
	private Nation nation;
	public Manufacturer(String manufacturerName, Nation nation) {
		ManufacturerName = manufacturerName;
		this.nation = nation;
	}
	public String getManufacturerName() {
		return ManufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		ManufacturerName = manufacturerName;
	}
	public Nation getNation() {
		return nation;
	}
	public void setNation(Nation nation) {
		this.nation = nation;
	}
	
	
	
	
}
