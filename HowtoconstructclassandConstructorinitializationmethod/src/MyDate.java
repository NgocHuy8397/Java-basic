
public class MyDate {
	private int date ;
	private int month;
	private int year;
	
	public MyDate(int d, int m, int y) {
		this.date = d;
		this.month = m;
		this.year = y;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void printDate() {
		System.out.println(this.date);
	}
	
	public void printMonth() {
		System.out.println(this.month);
	}
	public void printYear() {
		System.out.println(this.year);
	}
}
