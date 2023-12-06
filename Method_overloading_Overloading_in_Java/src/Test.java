
public class Test {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println("tim min: "+ mm.timMin(5, 8));
		System.out.println("Tim min: "+ mm.timMin(5.9, 4.6));
		System.out.println("Tong: "+ mm.tong(5.4, 4.4));
		double arr[] = new double[] {1,2,3,4,5,6};
		System.out.println("Tong arr: "+ mm.tinhTong(arr));
	}
}
