
public class Dog extends Animal{

	public Dog() {
		super("Dog");
	}

	@Override
	public void eat() {
		System.out.println("an xuong!");
	}

	@Override
	public void makeSound() {
		System.out.println("Gau gau");
	}

	@Override
	public void sleep() {
		System.out.println("Zzzzzzz");
	}

	
}
