
public class Test {
	public static void main(String[] args) {
		Manufacturer M1 = new Manufacturer("Manufacturer1", "USA");
		Manufacturer M2 = new Manufacturer("Manufacturer2", "Japan");
		Manufacturer M3 = new Manufacturer("Manufacturer3", "VietNam");
		
		Transport t1 = new Plane(M1, "Plane", "oil");
		Transport t2 = new Car(M2, "Car","oil");
		Transport t3 = new Bicycle(M3,"Bicyle");
		Plane p = new Plane(M1, "Plance", "Oil");
		
		System.out.println("Get manufacturer");
		System.out.println("Manufacturer1: "+ t1.nameManufacturer());
		System.out.println("Manufacturer2: "+ t2.nameManufacturer());
		System.out.println("Manufacturer3: "+ t3.nameManufacturer());
		
		System.out.println("_Start_");
		t1.start();
		
		System.out.println("get The Velocity");
		System.out.println("get The Velocity: "+ t1.getTheVelocity());
		System.out.println("get The Velocity: "+ t2.getTheVelocity());
		System.out.println("get The Velocity: "+ t3.getTheVelocity());
		
		p.catCanh();
		
	}
}
