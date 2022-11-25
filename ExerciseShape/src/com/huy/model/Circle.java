package com.huy.model;

public class Circle extends Shape {
	public static final String name = "Circle";
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public String getName() {
		return Circle.name;
	}

	@Override
	public String showInfor() {
		return "Circle: "+this.radius;
	}
	
	
	
	
}
