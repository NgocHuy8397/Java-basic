
public class Cat extends Animal{

	public Cat() {
		super("Cat");
	}

	@Override
	public void eat() {
		System.out.println("eat fish");
	}

	@Override
	public void makeSound() {
		System.out.println("Meo meo");
	}

	@Override
	public void sleep() {
		System.out.println("zzzzzzzzzzzzz");
	}

}
