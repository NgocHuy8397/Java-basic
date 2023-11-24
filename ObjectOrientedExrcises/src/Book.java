
public class Book {
	private String bookTitle;
	private double price;
	private int publishingYear;
	private Author Author;
	
	public Book(String bookTitle, double price, int publishingYear, Author author) {
		super();
		this.bookTitle = bookTitle;
		this.price = price;
		this.publishingYear = publishingYear;
		Author = author;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public Author getAuthor() {
		return Author;
	}

	public void setAuthor(Author author) {
		Author = author;
	}
	
	public void printTitleBook() {
		System.out.println("Title book: "+ this.bookTitle);
	}
	
	public boolean testSameYear(Book otherBook) {
		return this.publishingYear == otherBook.publishingYear;
	}
	
	public double priceAfterSale(double x) {
		return this.price * ((100-x)/100);
	}
}
