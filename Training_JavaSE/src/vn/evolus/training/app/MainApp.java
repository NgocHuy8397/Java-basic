package vn.evolus.training.app;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import vn.evolus.training.app.Outer.Inner;
import vn.evolus.training.converter.InchesToCmConverter;
import vn.evolus.training.converter.MetricSystemConverter;
import vn.evolus.training.model.Circle;
import vn.evolus.training.model.Point;
import vn.evolus.training.model.Rectangle;
import vn.evolus.training.model.Shape;
import vn.evolus.training.model.Square;
import vn.evolus.training.painter.BaseShapePainter;
import vn.evolus.training.painter.CirclePainter;
import vn.evolus.training.painter.Painter;
import vn.evolus.training.painter.SquarePainter;

public class MainApp {
    
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        System.out.println("Point: " + point.getCoordinate());

//      Method overriding
        System.out.println("---------Method overriding-------------");
        Painter painter = new Painter();
        painter.drawCircle(point, 10);
        
        
//      Type casting
        System.out.println("---------Type casting-------------");
        Shape s = new Circle();
        Circle circle = (Circle) s;        
        System.out.println("Radius: " + circle.getRadius());
        
//        Shape s1 = new Square();
//        Circle c1 = (Circle) s1;         // casting error
//        System.out.println("Radius: " + c1.getRadius());
        
        
//      Circle initialization        
        System.out.println("---------Circle initialization-------------");
        Circle c = new Circle();
        System.out.println("Circle Radius: " + c.getRadius()); // 3
        c = new Circle(5); 
        System.out.println("Circle Radius: " + c.getRadius()); // 5
        
        
//      Interfaces + Generic Types
        System.out.println("---------Interfaces + Generic Types-------------");
        drawShapes();
        
        
//      Interfaces + Inner class
        System.out.println("---------Interfaces + Inner class-------------");
        converterInfo();
        
//      Nested classes
        System.out.println("---------Nested classes-------------");
        nestedClassExample();
        
//      Collections
        System.out.println("---------Collections-------------");
        addAndSortCircles();
        
//      Enum and Exception
        System.out.println("---------Enum and Exception-------------");
        handleExceptionAndEnum();

    }
    
    
    public static void test(Point p) {
        System.out.println("MainApp.test()");
        System.out.println("p: " + p.getCoordinate());
        
        p = new Point(10, 30);
        System.out.println("new p: " + p.getCoordinate());
    }

    private static void addAndSortCircles() {
        List<Circle> circles = new ArrayList<Circle>();
        
        System.out.println("List class name: " + circles.getClass().getName());
        
        circles.add(new Circle(10));
        circles.add(new Circle(15));
        circles.add(new Circle(13));
        circles.add(new Circle(30));
        circles.add(new Circle(18));
        circles.add(new Circle(60));
        
        Comparator<Circle> circleComparator = new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                return o1.getRadius() - o2.getRadius();
            }
        };
        
        Collections.sort(circles, circleComparator);
        
        for (Circle circle : circles) {
            System.out.println(circle.toString());
        }
    }
    
    private static void drawShapes() {
        Circle circle = new Circle(20);
        Square square = new Square(50);
        
        CirclePainter circlePainter = new CirclePainter();
        circlePainter.draw(new Point(200, 300), circle);
        
        SquarePainter squarePainter = new SquarePainter();
        squarePainter.draw(new Point(400, 500), square);
        
        BaseShapePainter<Rectangle> rectanglePainter = new BaseShapePainter<Rectangle>(Rectangle.class) {
            
            @Override
            public void draw(Point p, Rectangle shape) {
                System.out.println(String.format("Draw Rectangle at %s", p.getCoordinate()));
            }
        };
        
        System.out.println("Rectangle Painter class name: " + rectanglePainter.getClass().getName());
        System.out.println("Rectangle Painter clazz name: " + rectanglePainter.getClazz().getName());
        
        
        rectanglePainter.draw(new Point(250, 700), new Rectangle(10, 57));
    }
    
    private static void converterInfo() {
        InchesToCmConverter converter = new InchesToCmConverter();
        
        MainApp mainApp = new MainApp();
        CmToInchesConverter cmConverter = mainApp.new CmToInchesConverter();
        
        printConverterClassName(converter);
        printConverterClassName(cmConverter);
        
        MetricSystemConverter metricConverter = new MetricSystemConverter() {
            
            @Override
            public double handle(double value) {
                return 0;
            }
        };
        
        System.out.println(metricConverter.getName());
    }
    
    private class CmToInchesConverter implements MetricSystemConverter {

        @Override
        public double handle(double value) {
            return value * 0.393701;
        }
        
    }
    
    private static void printConverterClassName(MetricSystemConverter converter) {
        System.out.println("Converter Class Name: " + converter.getClass().getName());
    }
    
    public static void nestedClassExample() {
        Outer.StaticInner staticInner = new Outer.StaticInner();
        System.out.println("Static Inner name: " + staticInner.getName());
        
        Outer outer = new Outer();
        System.out.println(outer.getName());
        
        Inner inner = outer.new Inner();
        System.out.println("Inner name: " + inner.getName());
    }
    
    public static void handleExceptionAndEnum() {
        Day d = Day.MONDAY;
        System.out.println("Day title: " + d.getTitle());
        
        // Checked exception
        readFile();
        
        // Unchecked exception
        Circle c = new Circle();
        c = null;
        System.out.println("Circle radius: " + c.getRadius());
    }
    
    private static void readFile() {
        File file = new File("temp.text");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            fos.write(10);
            
        } catch (IOException e) {
            e.printStackTrace();
            
        } finally {
            if (fos != null)
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
    
    
}
