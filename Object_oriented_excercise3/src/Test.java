
public class Test {
	public static void main(String[] args) {
		Date d1 = new Date(8, 3, 1997);
		Date d2 = new Date(8, 3, 1997);
		Date d3 = new Date(5, 2, 2000);
		
		Class cl1 = new Class("12C2", "CNTT");
		Class cl2 = new Class("12B3", "CK");
		Class cl3 = new Class("10B2", "KHMT");
		
		Student st1 = new Student("3q","Nguyen Ngoc Huy" , d1, 7.5, cl1);
		Student st2 = new Student("6b", "Nguyen Van A", d2, 8.0, cl2);
		Student st3 = new Student("7a", "Nguyen Van B", d3, 4.0, cl3);
		
		System.out.println("Name faculty: "+ cl1.getFacultyName());
		System.out.println("Name faculty: "+ cl2.getFacultyName());
		System.out.println("Name faculty: "+ cl3.getFacultyName());
		
		System.out.println("pass: "+ st1.passTheExam());
		System.out.println("pass: "+ st2.passTheExam());
		System.out.println("pass: "+ st3.passTheExam());
		
		System.out.println("st1 & st2 "+ st1.CheckSameDateOfBirth(st2));
		System.out.println("st1 & st2 "+ st1.CheckSameDateOfBirth(st3));
		System.out.println("st1 & st2 "+ st2.CheckSameDateOfBirth(st3));
		
	}
}
