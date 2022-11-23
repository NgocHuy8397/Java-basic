package vn.evolus.training.painter;

import vn.evolus.training.model.Point;

public class BaseShapePainter<T> implements IShapePainter<T> {
    
    private Class<T> clazz;
    public BaseShapePainter(Class<T> clazz) {
        this.clazz = clazz;
        
        try {
            T objT = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    
    public Class<T> getClazz() {
        return clazz;
    }

    @Override
    public void draw(Point p, T shape) {
        
    }

}
