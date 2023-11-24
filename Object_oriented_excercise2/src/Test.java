
public class Test {
	public static void main(String[] args) {
		Date d1 = new Date(10, 4, 2012);
		Date d2 = new Date(12, 6, 2022);
		Date d3 = new Date(8, 9, 2011);
		
		Manufacturer m1 = new Manufacturer("A", "Viet Nam");
		Manufacturer m2 = new Manufacturer("B", "USA");
		Manufacturer m3 = new Manufacturer("C", "England");
		
		Movie movie1 = new Movie("Mavel", 2020, m1, 300, d1);
		Movie movie2 = new Movie("Dat Phuong nam", 2023, m2, 500, d2);
		Movie movie3 = new Movie("Bo gia", 2022, m3, 600, d3);
		
		System.out.println("test fare: "+ movie1.checkOutCheaperFares(movie3));
		System.out.println("test fare: "+ movie1.checkOutCheaperFares(movie2));
		System.out.println("test fare: "+ movie1.checkOutCheaperFares(movie2));
		
		System.out.println("Manufacturer name: "+ m1.getManufacturerName());
		System.out.println("Manufacturer name: "+ m2.getManufacturerName());
		System.out.println("Manufacturer name: "+ m3.getManufacturerName());
		
		System.out.println("Price after sale: "+ movie1.priceAfterSale(10));
		System.out.println("Price after sale: "+ movie2.priceAfterSale(20));
		System.out.println("Price after sale: "+ movie3.priceAfterSale(50));
		
		
	}
}
