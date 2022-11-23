package vn.evolus.training.model;

public class PlaneCircle extends Circle {
    private int cx;
    private int cy;
    
    public PlaneCircle(int radius, int cx, int cy) {
        super(radius);
        this.cx = cx;
        this.cy = cy;
    }

    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }
}


