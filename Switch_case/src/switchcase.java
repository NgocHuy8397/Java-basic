import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số nguyên từ 0 đến 8 :");
		n = sc.nextInt();
		
		switch (n) {
		case 2: {
			System.out.println("Thứ hai");
			break;
		}
		case 3:{
			System.out.println("Thứ ba");
			break;
		}
		case 4:{
			System.out.println("Thứ tư");
			break;
		}
		case 5:{
			System.out.println("Thứ nam");
			break;
		}
		case 6:{
			System.out.println("Thứ sau");
			break;
		}
		case 7:{
			System.out.println("Thứ bay");
			break;
		}
		case 8:{
			System.out.println("Chủ nhật");
			break;
		}
		default:
			System.out.println("nhập dữ liệu sai");
		}
	}
}
