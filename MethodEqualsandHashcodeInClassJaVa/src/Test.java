
public class Test {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(20, 11, 2023);
		MyDate md2 = new MyDate(24, 12, 2023);
		MyDate md3 = new MyDate(20, 11, 2023);
		
		System.out.println("My Date1 "+ md1);
		System.out.println("My Date1 "+ md2);
		System.out.println("My Date1 "+ md3);
		
//		if(md1 == md2) {
//			System.out.println("md1 = md2");
//		}else {
//			System.out.println("md1 != md2");
//		}
		
		System.out.println("So sánh md1 = md3 "+ md1.equals(md3));
		System.out.println("So sánh md1 = md3 "+ md1.equals(md2));
		
		System.out.println("HashCode "+ md1.hashCode());
		System.out.println("Hashcode "+ md2.hashCode());
		System.out.println("Hashcode "+ md3.hashCode());
	}
	
}
