
public class CompareString {
	public static void main(String[] args) {
		String s1 = "titv.vn";
		String s2 = "TITV.VN";
		String s3 = "titv.vn";
		
		//equals => so sanh hai chuoi giong nhau, co phan biet hoa thuong
		System.out.println("S1 equals S2: "+ s1.equals(s3));
		System.out.println("S1 equals S2: "+ s1.equals(s2));
		
		//equalsIgnoreCase => so sanh 2 chuoi giong nhau, khong phan biet hoa thuong
		System.out.println("S1 qualsIgnoreCase S2: "+ s1.equalsIgnoreCase(s3));
		System.out.println("S1 qualsIgnoreCase S2: "+ s1.equalsIgnoreCase(s2));
		
		//ComparseTo => so sanh < > =
		String sv3 = "Nguyễn Văn";
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn B";
		String sv4 = "Nguyễn Văn A";
		
		System.out.println("Sv1 comparseto sv2: "+ sv1.compareTo(sv2));
		System.out.println("Sv1 comparseto sv3: "+ sv1.compareTo(sv3));
		System.out.println("Sv1 comparseto sv4: "+ sv1.compareTo(sv4));
		
		// Ham compareToIgnoreCase => Tuong tu ham compareTo, khong biet chu hoa chu thuong
		
		String name1 = "Nguyen Ngoc Huy";
		String name2 = "Nguyen Ngoc hi";
		
		System.out.println("name1 comparetoignorecase name2: "+ name1.compareToIgnoreCase(name2));
		
		// Hàm regionMatches => so sánh một đoạn
		String r1 = "TITV.vn";
		String r2 = "TV.v";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);
		// 0937 456 789
		// 0937 455 765
		
		// Hàm startWith => Hàm kiểm tra chuỗi bắt đầu bằng ....
		String sdt = "037456789";
		System.out.println("StartWith: "+sdt.startsWith("037"));
		System.out.println("StartWith: "+sdt.startsWith("034"));
		
		// Hàm endWith => Hàm kiểm tra chuỗi kết thúc bằng ...
		String tenFile = "I love you.JPG";
		String tenFile2 = "Hoc Java.PDF";
		if (tenFile.endsWith(".JPG")) {
			System.out.println("File 1 là hình ảnh!");
		}else if (tenFile.endsWith(".PDF")) {
			System.out.println("File 1 là file PDF!");
		}
		
		if (tenFile2.endsWith(".JPG")) {
			System.out.println("File 2 là hình ảnh!");
		}else if (tenFile2.endsWith(".PDF")) {
			System.out.println("File 2 là file PDF!");
		}
	}
}
