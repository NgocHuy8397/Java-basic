package vn.evolus.training.painter;

import vn.evolus.training.model.Point;

public class Painter {
    
    public void drawCircle(Point point, int radius) { 
        System.out.println(String.format("Draw Circle at %s", point.getCoordinate()));
    }
    
    public void drawCircle(int x, int y, int radius) {
        System.out.println(String.format("Draw Circle at (%s; %s)", x, y));
    }
}
