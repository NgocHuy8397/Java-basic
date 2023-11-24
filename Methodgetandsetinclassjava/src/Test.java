
public class Test {
	public static void main(String[] args) {
		MyDate md = new MyDate(19, 12, 2023);
		System.out.println("Day "+ md.getDay());
		md.setDay(35);
		System.out.println("Day "+md.getDay());
		
		System.out.println("Month "+md.getMonth());
		md.setMonth(34);
		System.out.println("Month "+md.getMonth());
		
		System.out.println("Year "+md.getYear());
		md.setYear(2023);
		System.out.println("Year "+md.getYear());
		
		System.out.println("Date "+md.toString());
	}
}
