package vn.evolus.training.painter;

import vn.evolus.training.model.Point;

public interface IShapePainter<T> {
    void draw(Point p, T shape);
}
