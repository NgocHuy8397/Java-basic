import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter string: ");
		s = sc.nextLine();
		System.out.println("----------------------");
		
		//Ham length() => lay do dai chuoi;
		System.out.println(s.length());
		int dodai = s.length();
		
		//Ham charAt(vitri) => lay ra mo ky tu tai vi tri
		for(int i = 0; i < dodai; i++) {
			System.out.println("Vi tri: "+ i +"La: "+ s.charAt(i));
		}
		
		//Ham getChars(vi tri bat dau, vi tri key thuc, mang luu du lieu, vi tri bat dau luu cu mang)
		//lay ra cac gia tri cua 1 mang char trong 1 chuoi
		char[] arrayChar = new char[100]; 
		s.getChars(2, 5, arrayChar, 0);
		for(int i = 0; i < arrayChar.length; i++) {
			System.out.println("Gia tri cua mang tai "+ i +"la:"+ arrayChar[i]);
		}
		//getbyte => co 3 cach, lay ra gia tri cua cac ky tu thanh 1 mang
		byte[] arrayByte = s.getBytes();
		for(byte b : arrayByte) {
			System.out.println(b);
		}
	}
}
