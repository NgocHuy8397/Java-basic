
public class Test {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 600, 2);
		System.out.println("Tong tien "+ hd.tinhTongTien());
		System.out.println("Kiem tra khoi luong co lon hon "+ hd.kiemTraKhoiLuongCoLonHon(1));
		System.out.println("Kiem tra tong tien co lon hon 500K "+ hd.kiemTraTongTienCoLonHon500k() );
		System.out.println("Giam gia "+ hd.giamGia(50));
		System.out.println("Sau khi giam gia "+ hd.sauKhiGiamGia(50));
	}
}
