package vn.evolus.training.model;

public abstract class Shape {
    public abstract double area();

    public abstract double circumference();
    
    public Shape() {
        System.out.println("Shape contructor");
    }
    
    public String getName() {
        return "Shape";
    }
}


