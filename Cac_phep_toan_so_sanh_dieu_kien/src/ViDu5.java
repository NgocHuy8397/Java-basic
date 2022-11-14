import java.util.Scanner;

public class ViDu5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Nhập a = ");
		a = sc.nextInt();
		System.out.println("Nhập b =");
		b= sc.nextInt();

		// xuất kêt quả so sánh
		System.out.println(a +" == "+b +" : "+ (a==b));
		System.out.println(a +" != "+b +" : "+ (a!=b));
		System.out.println(a +" < "+b +" : "+ (a<b));
		System.out.println(a +" <= "+b +" : "+ (a<=b));
		System.out.println(a +" > "+b +" : "+ (a>b));
		System.out.println(a +" >= "+b +" : "+ (a>=b));
		System.out.println(" ---------- ");
		System.out.println("Ca hai số là số chẵn: "+(a%2==0 && b%2==0));
		System.out.println("Có ít nhất 1 số chẵn: "+(a%2==0 || b%2==0));


		



	}
}
