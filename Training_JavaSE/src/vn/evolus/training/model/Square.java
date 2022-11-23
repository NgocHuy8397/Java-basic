package vn.evolus.training.model;

public class Square extends Shape {
    private int side;
    
    public Square() {
    }
    
    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double circumference() {
        // TODO Auto-generated method stub
        return 0;
    }
}
