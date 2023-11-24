
public class Test {
	public static void main(String[] args) {
		Date date1 = new Date(10, 12, 2020);
		Date date2 = new Date(4, 5, 2022);
		Date date3 = new Date(30, 10, 2023);
		
		Author author1 = new Author("Ngoc Huy", date1);
		Author author2 = new Author("Huy Nguyen", date3);
		Author author3 = new Author("Nguyen Huy", date2);
		
		Book book1 = new Book("Java basic", 300, 2015, author3);
		Book book2 = new Book("Javascript basic", 500, 2010, author2);
		Book book3 = new Book("Python basic", 1000, 2015, author1);
		
		book1.printTitleBook();
		book2.printTitleBook();
		book3.printTitleBook();
		
		System.out.println("compare book1 and book3: "+book1.testSameYear(book3));
		System.out.println("compare book1 and book3: "+book1.testSameYear(book2));
		
		System.out.println("Price after sale "+ book1.priceAfterSale(10));
		System.out.println("Price after sale "+ book2.priceAfterSale(10));
		System.out.println("Price after sale "+ book3.priceAfterSale(50));
		
	}
}
