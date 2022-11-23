package vn.evolus.training.painter;

import vn.evolus.training.model.Point;
import vn.evolus.training.model.Square;

public class SquarePainter implements IShapePainter<Square> {

    @Override
    public void draw(Point p, Square shape) {
        System.out.println(String.format("Draw Square at %s", p.getCoordinate()));        
    }

}
