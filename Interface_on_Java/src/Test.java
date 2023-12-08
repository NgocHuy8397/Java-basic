
public class Test {
	public static void main(String[] args) {
		System.out.println("Test cau a");
		MayTinhCasioFX500 fx500 = new MayTinhCasioFX500();
		MayTinhVinacal500 mvn = new MayTinhVinacal500();
		System.out.println("FX500");
		System.out.println("Cong: "+ fx500.cong(6, 7));
		System.out.println("tru: "+ fx500.tru(6, 7));
		System.out.println("Nhan: "+ fx500.nhan(6, 7));
		System.out.println("Chia: "+ fx500.chia(6, 7));
		
		System.out.println("Vinacal ");
		System.out.println("Cong: "+ mvn.cong(6, 7));
		System.out.println("tru: "+ mvn.tru(6, 7));
		System.out.println("Nhan: "+ mvn.nhan(6, 7));
		System.out.println("Chia: "+ mvn.chia(6, 7));
		
		System.out.println("Test cau b");
		double[] arr = new double[] {5,1,3,4};
		double[] arr2 = new double[] {7,1,5,8,9};
		SapXepChen sxc = new SapXepChen();
		SapXepChon sx = new SapXepChon();
		sxc.sapXepGiam(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ "");
		}
		System.out.println("----------------------------------");
		sxc.sapXepTang(arr2);
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		System.out.println("Test cau C");
		PhanMemMayTinh pm = new PhanMemMayTinh();
		System.out.println("3 + 5 = "+ pm.cong(3, 5));
		double[] arr3 = new double[] {5,1,3,4};
		pm.sapXepTang(arr3);
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+ "");
		}
	}
}
