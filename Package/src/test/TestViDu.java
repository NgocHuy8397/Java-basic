package test;

import code.Vidu;
import code2.Vidu2;

public class TestViDu {
	public static void main(String[] args) {
		Vidu vd = new Vidu(4, 5);
		System.out.println(vd.getA());
		
		Vidu2 vd2 = new Vidu2(4, 6, 8);
		System.out.println(vd2.getB());
	}
}
