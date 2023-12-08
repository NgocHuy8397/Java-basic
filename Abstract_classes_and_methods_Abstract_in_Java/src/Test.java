
public class Test {
	public static void main(String[] args) {
		Coordinates c1 = new Coordinates(5, 5);
		Coordinates c2 = new Coordinates(3, 7);
		Coordinates c3 = new Coordinates(2, 8);
		
//		Hinh h1 = new Hinh(c1);=>Loi bien dich 
		
		Hinh h1 = new Diem(c1);
		Hinh h2 = new Circle(c2, 5);
		Hinh h3 = new Rectangle(c3, 6, 7);
		
		System.out.println("the area: "+ h1.theArea());
		System.out.println("the area: "+ h2.theArea());
		System.out.println("the area: "+ h3.theArea());
	}
}
