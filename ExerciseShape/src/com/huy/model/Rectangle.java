package com.huy.model;

public class Rectangle extends Shape {
	public static final String name = "Rectangle";
	private double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return this.length * this.width;
	}

	@Override
	public String getName() {
		return Rectangle.name;
	}

	@Override
	public String showInfor() {
		return "Rectangle: "+this.length+" "+this.width;
	}

}
