
public class Test {
	public static void main(String[] args) {
		Date d1 = new Date(10, 11, 2012);
		Date d2 = new Date(17, 9, 1998);
		Date d3 = new Date(20, 10, 1992);
		
		Nation N1 = new Nation("00B1", "USA");
		Nation N2 = new Nation("00A1", "VietNam");
		Nation N3 = new Nation("00C2", "TaiWan");
		
		Manufacturer m1 = new Manufacturer("Asus", N3);
		Manufacturer m2 = new Manufacturer("Dell", N1);
		Manufacturer m3 = new Manufacturer("Apple", N2);
		
		Computer cp1 = new Computer(m3, N3, 1500, 12);
		Computer cp2 = new Computer(m3, N2, 3000, 12);
		Computer cp3 = new Computer(m3, N1, 8000, 12);
		
		System.out.println("cp1 && cp2 "+ cp1.CheckOutLowerPrices(cp2));
		System.out.println("cp1 && cp3 "+ cp1.CheckOutLowerPrices(cp3));
		System.out.println("cp2 && cp1 "+ cp2.CheckOutLowerPrices(cp1));
		
		System.out.println("print nation "+ N1.getCountryName());
		System.out.println("print nation "+ N2.getCountryName());
		System.out.println("print nation "+ N3.getCountryName());
		
	}
}
