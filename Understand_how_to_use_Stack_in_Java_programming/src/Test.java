import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stackChuoi = new Stack<String>();
//		stackChuoi.push("Giai tri");//dua gia tri vao stack
		//stackChuoi.pop();// lay gia tri ra, xoa khoi stack
		// stackChuoi.peek() => lấy giá trị ra, nhưng không xóa khỏi stack
		// stackChuoi.clear(); => xóa tất cả phần tử trong stack
		// stackChuoi.contains("giatri")=> xác định giá trị có tồn tại trong stack hay không
		// stackChuoi.size() => độ lớn của stack
		
		//vidu dao nguoc chuoi
		System.out.println("Nhap vao mot chuoi");
		String s = sc.nextLine();
		//TITV
		for(int i = 0; i < s.length(); i++) {
			stackChuoi.push(s.charAt(i)+ "");
		}
			System.out.println("Chuoi dao nguoc");
			for(int i = 0; i < s.length(); i++) {
				System.out.print(stackChuoi.pop());
			}
			//vidu chuyen tu he nhi phan sang he thap phan
			
			Stack<Integer> stackSoDu = new Stack<Integer>();
			System.out.println("Nhap mot so nguye duong tu ban phim");
			int x = sc.nextInt();
			while(x>0) {
				int soDu = x % 2;
				stackSoDu.push(soDu);
				x = x/2;
			}
			int n = stackSoDu.size();
			for(int i = 0; i < n; i++) {
				System.out.print(stackSoDu.pop());
			}
	}
}
