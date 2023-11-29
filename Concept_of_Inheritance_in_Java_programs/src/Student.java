
public class Student extends Human {
	private String ClassName, SchoolNAme;

	public Student(String Name, int DateofBirth, String className, String schoolNAme) {
		super(Name, DateofBirth);
		ClassName = className;
		SchoolNAme = schoolNAme;
	}

	public String getClassName() {
		return ClassName;
	}

	public void setClassName(String className) {
		ClassName = className;
	}

	public String getSchoolNAme() {
		return SchoolNAme;
	}

	public void setSchoolNAme(String schoolNAme) {
		SchoolNAme = schoolNAme;
	}
	
	public void HomeWork() {
		System.out.println("...........");
	}
	
	
	
}
