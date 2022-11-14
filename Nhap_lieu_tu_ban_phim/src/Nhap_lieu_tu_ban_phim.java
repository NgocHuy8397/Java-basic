import java.util.Scanner;

public class Nhap_lieu_tu_ban_phim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào họ và tên: ");
		String hoVaTen = sc.nextLine();
		
		System.out.println("Nhập mã sinh viên: ");
		long nhapMaSinhVien = sc.nextLong();
		
		System.out.println("Nhập vào điểm thi: ");
		float nhapDiemThi = sc.nextFloat();

		System.out.println("-----------");
		System.out.println("Họ và tên: "+ hoVaTen);
		System.out.println("Nhập mã sinh viên: "+ nhapMaSinhVien);
		System.out.println("Nhập điểm thi: "+ nhapDiemThi);
	}
}
