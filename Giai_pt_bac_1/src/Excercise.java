import java.util.Scanner;

public class Excercise {
	public static void main(String[] args) {
		double a, b, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a");
		a = sc.nextDouble();
		System.out.println("Nhap vao so b");
		b = sc.nextDouble();
		
		if(a == 0) {
			//tinh huong a==0
			if(b == 0) {
				// tinh huong a=0 va b=0
				System.out.println("Phuong trinh vo so nghiem!: ");
			} else {
				// tinh huong a=0 va b!=0
				System.out.println("Phuong trinh vo nghiem!: ");
			}
		} else {
			// tinh huong a!=0
			x = -b/a;
			System.out.println("Phuong trinh co nghiem: "+ x);
		}
	}
}
