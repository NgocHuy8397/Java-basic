package com.huy.model;

public class Triangle extends Shape {
	public static final String name = "Triangle";
	private double a, b, c, h;
	
	public Triangle(double a, double b, double c, double h) {
		if (a + b > c && a + c > b && b + c > a) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.h = h;
		}
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	@Override
	public double getArea() {
		return 1/2* this.h * this.c;
	}
	@Override
	public String getName() {
		return Triangle.name;
	}
	@Override
	public String showInfor() {
		return "Triangle: "+this.a +" "+this.b+" "+this.c+" "+this.h;
	}
	
	
	
	
}
