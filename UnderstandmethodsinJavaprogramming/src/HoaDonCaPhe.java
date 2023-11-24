
public class HoaDonCaPhe {
	private String tenCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;
	
	public HoaDonCaPhe(String ten, double gia, double kL) {
		this.tenCaPhe = ten;
		this.giaTien1Kg = gia;
		this.khoiLuong = kL;
	}
	
	public double tinhTongTien() {
		return this.khoiLuong * this.giaTien1Kg;
	}
	
	public boolean kiemTraKhoiLuongCoLonHon(double kL) {
		return this.khoiLuong > kL;
				
	}
	
	public boolean kiemTraTongTienCoLonHon500k() {
		return this.tinhTongTien()> 500;
	}
	
	public double giamGia(double x) {
		if(this.tinhTongTien() > 500) {
			return (x/100) * this.tinhTongTien();
		}else {
			return 0;
		}
	}
	
	public double sauKhiGiamGia(double x) {
		return this.tinhTongTien() - this.giamGia(x);
	}
}
