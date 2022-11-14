import java.util.Scanner;

public class vidu {
public static void main(String[] args) {
	// khai báo biến
	int a, b;
	//nhập dữ liệu từ bàn phím
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao a = ");
	a = sc.nextInt();
	System.out.println("Nhap vao b = ");
	b = sc.nextInt();
	
	int tong = a + b;
	System.out.println(a+" + "+b+" = "+tong);
	
	int hieu = a - b;
	System.out.println(a+" - "+b+" = "+hieu);
	
	int tich = a * b;
	System.out.println(a+" * "+b+" = "+tich);
	
	float thuong = (float)a / b;
	System.out.println(a+" / "+b+" = "+thuong);
	

	int soDu = a % b;
	System.out.println(a+" % "+b+" = "+soDu);
}
}
