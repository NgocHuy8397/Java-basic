import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào số a: ");
		a = sc.nextDouble();
		System.out.println("nhập vào số b: ");
		b = sc.nextDouble();
		
		//Hàm gía trị tuyệt đối
		System.out.println("|a|=" + Math.abs(a));
		
		//Hàm tìm min
		System.out.println("min(a, b) = " + Math.min(a, b));
		//Hàm tìm max
		System.out.println("max(a, b) = " + Math.max(a, b));
		//Hàm tìm ceil
		System.out.println("ceil(a) = " + Math.ceil(a));
		//Hàm tìm floro
		System.out.println("floor(a) = " + Math.floor(a));
		//Ham tim can bac hai
		System.out.println("sqrt(a) = " + Math.sqrt(a));
		//Ham tinh a^b
		System.out.println("a^b = " + Math.pow(a, b));

	}
}
