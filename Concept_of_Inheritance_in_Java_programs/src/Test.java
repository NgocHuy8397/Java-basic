
public class Test {
	public static void main(String[] args) {
		Human human1 = new Human("Huy", 1997);
		Human human2 = new Human("Hi", 2000);
		
		human1.Eat();
		human2.Drink();
		human1.Sleep();
		
		Student studen = new Student("Huy", 2000, "Class 1", "TDN");
		studen.Drink();
		studen.Eat();
	    studen.Sleep();
	    studen.HomeWork();
	    
	    System.out.println("Name: "+ studen.getName());
	    System.out.println("date of birth: "+ studen.getDateofBirth());
	    System.out.println("Class: "+ studen.getClassName());
	    System.out.println("School: "+ studen.getSchoolNAme());
	}
}
