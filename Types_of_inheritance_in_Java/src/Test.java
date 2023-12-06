
public class Test {
	public static void main(String[] args) {
		Dog d = new Dog("lu lu");
		System.out.println("name: "+ d.name);
		d.bark();
		System.out.println("---------------------------------");
		Babydog bbd = new Babydog("Baby");
		System.out.println("name: "+ bbd.name);
		bbd.bark();
		bbd.eat();
		System.out.println("---------------------------------");
		Cat c = new Cat();
		c.name();
		c.eat();
		c.meow();
		System.out.println("---------------------------------");
		Bird b = new Bird("Bird");
		b.name();
		b.eat();
		b.fly();
		
	}
}
