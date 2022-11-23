package vn.evolus.training.model;

public class Circle extends Shape {
    public static final double PI = 3.14159265358979323846;

    private int radius = 1; // default initial value
    
    // initialization block
    { 
        radius = 2;
    }
    
    public Circle() { // a constructor with no-argument
        System.out.println("Circle contructor");
    }
    
    public Circle(int radius) { // a constructor with one argument
        this.radius = radius;
    }
    
    // initialization block
    {
        radius = 3;
        
    }
    
    public int getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return super.getName() + " > " + "Circle";
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double circumference() {
        return 0;
    }
    
    @Override
    public String toString() {
        return "Radius: " + this.radius;
    }

}
