package vn.evolus.training.model;

public class Point {
    public static String Name = "ABC";
    private double x;
    private double y;
    
    public Point() {
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    
    public String getCoordinate() {
        return String.format("(%s; %s)", this.x, this.y);
    }
    
}
