import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so nguyen n: ");
		n = sc.nextInt();
		//Kiem tra tinh chan le
		if(n % 2 == 0) {
			System.out.println(n +" La so chan");
		} else {
			System.out.println(n +" La so le");
		}
	}
}
	
