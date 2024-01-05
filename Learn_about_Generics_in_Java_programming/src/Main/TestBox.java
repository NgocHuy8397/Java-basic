package Main;

public class TestBox {
	public static void main(String[] args) {
		Box box = new Box(25);
		System.out.println("Gia tri: "+ box.getValue());
		
//		Box box = new Box(15.5); => Báo lỗi
//		Box box = new Box("Mười lăm")=> Báo lỗi		
	}
}
