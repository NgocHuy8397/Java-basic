import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		double a, b, c, x1, x2, delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao a: ");
		a = sc.nextDouble();
		System.out.println("nhap vao b: ");
		b = sc.nextDouble();
		System.out.println("nhap vao c: ");
		c = sc.nextDouble();

		if (a == 0) {
			System.out.println("nhập dữ liệu sai");
			return;
		}
		
		delta = Math.pow(b, 2) - 4 * a * c;

		if (delta == 0) {
			x1 = -b / (2 * a);
			System.out.println("Phuong trình có nghiệm kép x1=x2= : " + x1);
		} else if (delta < 0) {
			System.out.println("Phương trình vô nghiệm!");
		} else {
			x1 = (-b - Math.sqrt(delta)) / (2 * a);
			x2 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("Phuong trinh có hai nghiệm phân biệt: ");
			System.out.println("x1 =" + x1);
			System.out.println("x2 =" + x2);
		}
	}
}
