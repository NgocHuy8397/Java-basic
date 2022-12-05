import java.util.Arrays;

public class ViDu {
	public static void main(String[] args) {
		//Kiểu nguyên thủy
		int[] mang1 = {1,2,3};
		
		//Copy mảng cách 1
		int[] mang1_a = mang1;
		mang1_a[0] = 100;
		
		System.out.println("Mảng 1: "+Arrays.toString(mang1));
		System.out.println("Mảng 1: "+Arrays.toString(mang1_a));
		
		//Copy mang cách 2 - dùng hàm clone
		int[] mang1_b = mang1.clone();
		mang1_a[0] = 50;
		System.out.println("Mảng 1_b: "+Arrays.toString(mang1_a));

		//Copy mang cách 3 - dùng hàm System.Arraycopy
		int[] mang1_c = new int[mang1.length];
		System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
		mang1_c[0] = 90;
		System.out.println("Mảng 1_c: "+Arrays.toString(mang1_c));
		
		//Kiểu nguyên thủy
		String[] mang_doi_tuong = {"Huy", ".vn"};
		
		String[] mang_doi_tuong1 = mang_doi_tuong;
		mang_doi_tuong1[0] = "Ngọc";
		
//		System.out.println("mang_doi_tuong: "+Arrays.toString(mang_doi_tuong));
//		System.out.println("mang_doi_tuong 1: "+Arrays.toString(mang_doi_tuong1));
		
		String[] mang_doi_tuong1_b = mang_doi_tuong.clone();
		mang_doi_tuong[1] = "Nguyễn";
		System.out.println("mang_doi_tuong1_b: "+Arrays.toString(mang_doi_tuong));
	}
}
