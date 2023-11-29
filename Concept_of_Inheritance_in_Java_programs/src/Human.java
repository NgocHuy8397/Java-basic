
public class Human {
	private String Name;
	private int DateofBirth;
	
	public Human(String Name, int DateofBirth) {
		this.DateofBirth = DateofBirth;
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getDateofBirth() {
		return DateofBirth;
	}

	public void setDateofBirth(int dateofBirth) {
		DateofBirth = dateofBirth;
	}
	
	public void Eat() {
		System.out.println("mem mem");
	}
	
	public void Drink() {
		System.out.println("uc uc");
	}
	
	public void Sleep() {
		System.out.println("zzzzzz");
	}
	
//	public void Homework() {
//		System.out.println();
//	}
//	
	
}
