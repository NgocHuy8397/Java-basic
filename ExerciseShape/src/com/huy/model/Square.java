package com.huy.model;

public class Square extends Shape {
	
	public static final String name = "Square";
	private double a;
	
	public Square(double a) {
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public double getArea() {
		return this.a * this.a;
	}

	@Override
	public String getName() {
		return Square.name;
	}

	@Override
	public String showInfor() {
		return "Square: "+" "+this.a;
	}
	
	
	
	
}
