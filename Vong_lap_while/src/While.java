import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		int x = 1;
		Scanner sc = new Scanner(System.in);
		while(x!=0) {
			System.out.println("Nhap x = 0 de thoat; nhap ky tu khac de tiep tuc");
			x = sc.nextInt();
		}
		
		int i = 0;
		while(true) {
			System.out.println("numbers"+ i);
			i++;
			if(i == 10) {
				break;
			}
		}
	}
}
