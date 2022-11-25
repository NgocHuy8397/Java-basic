package com.huy.demo;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.huy.model.Circle;
import com.huy.model.Shape;
import com.huy.model.Square;
import com.huy.model.Triangle;

public class Test {
	public static void main(String[] args) {
		Shape s1 = new Circle(7);
		Shape s2 = new com.huy.model.Rectangle(5, 4);
		Shape s3 = new Square(2);
		Shape s4 = new Triangle(5, 4, 6, 4);
		Shape s5 = new Circle(8);
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(s1);
		shapes.add(s2);
		shapes.add(s3);
		shapes.add(s4);
		shapes.add(s5);
		
		Map<String, Integer> request = new HashMap<String, Integer>();
		request.put("Circle", 1);
		request.put("Triangle", 2);
		request.put("Rectangle", 3);
		request.put("Square", 4);
		
		Collections.sort(shapes, new Comparator<Shape>() {

			@Override
			public int compare(Shape o1, Shape o2) {
				return request.get(o1.getName()) - request.get(o2.getName());
			}
		});
		
		for (Shape shape : shapes) {
			System.out.println(shape.showInfor());
		}

		System.out.println("Area Circle: "+ s1.getArea());
		
		System.out.println("Area rectangle: "+ s2.getArea());

		System.out.println("Area triangle: "+ s3.getArea());
	
		System.out.println("Area square: "+ s4.getArea());
	}
}
