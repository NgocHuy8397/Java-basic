package vn.evolus.training.painter;

import vn.evolus.training.model.Circle;
import vn.evolus.training.model.Point;

public class CirclePainter implements IShapePainter<Circle> {
    
    public CirclePainter() {
    }

    @Override
    public void draw(Point p, Circle shape) {
        System.out.println(String.format("Draw Circle at %s", p.getCoordinate()));
    }
}
