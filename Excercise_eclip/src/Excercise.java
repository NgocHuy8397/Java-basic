import java.util.Scanner;

public class Excercise {
	public static void main(String[] args) {
		double r, dienTich, chuVi;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ban kinh r: ");
		r = sc.nextDouble();
		
		//Tinh chu vi
		chuVi = 2 * Math.PI*r;
		System.out.println("Chu vi: "+ chuVi);
		System.out.println("Chu vi: "+ Math.round(chuVi));
		System.out.println("Chu vi: "+ Math.round(chuVi*100.0)/100.0);
		
		//Dien tich
		dienTich = Math.PI * Math.pow(r, 2);
		System.out.println("Dien tich: "+ dienTich);
		System.out.println("Chu vi: "+ Math.round(dienTich));
		System.out.println("Chu vi: "+ Math.round(dienTich*100.0)/100.0);
	}
}
