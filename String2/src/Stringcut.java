
public class Stringcut {
	public static void main(String[] args) {
		String s1 = "Ngoc";
		String s2 = ".Huy";
		String s3 = s1 + s2;
		
		//Ham concat => noi chuoi
		String s4 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		//Ham replace => thay the
		String s5 = "Huy.vn";
		String s6 = s5.replace("Huy.vn", "Huy.com");
		System.out.println(s6);
		
		//Ham toLowCase => chuyen ve viet thuong
		//Ham toUpperCase => chuyen ve viet hoa
		String s7 = s1.toLowerCase();
		System.out.println(s7);
		String s8 = s1.toUpperCase();
		System.out.println(s8);
		
		// trim() => xóa khoảng trắng dư thừa ở đầu chuỗi
		String s9 = "  Xin chào các bạn, mình là TITV.vn    ";
		System.out.println(s9.trim());
		
		// subString => cắt chuỗi con
		String s10 = "Xin chào các bạn, mình là TITV.vn";
		String s11 = s10.substring(10);
		String s12 = s10.substring(10, 15);
		System.out.println("s11 = " + s11);
		System.out.println("s12 = " + s12);
	}
}
