
public class Test {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.makeSound();
		System.out.println("________________________________");
		Cat c = new Cat();
		c.eat();
		c.makeSound();
		c.sleep();
		System.out.println("________________________________");
		Bird b = new Bird();
		b.eat();
		b.makeSound();
	}
}
