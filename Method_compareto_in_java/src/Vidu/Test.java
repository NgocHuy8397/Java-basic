package Vidu;

public class Test {
	public static void main(String[] args) {
		Student st1 = new Student(240, "Nguyen Ngoc Huy", "16dds06032", 8.0);
		Student st2 = new Student(211, "Nguyen Ngoc B", "16dds06033", 5.0);
		Student st3 = new Student(211, "Nguyen Ngoc H", "16dds06035", 5.0);
		System.out.println(st1.compareTo(st2));
		System.out.println(st1.compareTo(st3));
	}
}
