package ViDu;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(150, "Nguyen Ngoc Huy", "lop 1", 9);
		SinhVien sv2 = new SinhVien(100, "Nguyen thi Thanh Huyen", "lop 2", 8);
		SinhVien sv3 = new SinhVien(199, "Nguyen Van An", "lop 3", 8);
		
		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv3.compareTo(sv1));
	}
}
