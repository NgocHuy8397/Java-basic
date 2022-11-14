import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n");
		n = sc.nextInt();
		
		String nhiPhan = "";
		while(n>0) {
			nhiPhan = (n%2)+ nhiPhan;
			n = n/2;
		}
		System.out.println("He nhi phan la: "+ nhiPhan);
		/*
		 * Chia lien tuc cho 2 va lay phan du
		 * Dao nguoc chuoi => ket qua
		 * 
		 * 10: 2 = 5 du 0
		 * 5:2=2 du 1
		 * 2:2=1 du 0
		 * 1:0=0 du 1
		 * 1010
		 * 0
		 * 10
		 * 010
		 * 1010
		 */ 
	}
}
