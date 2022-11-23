package vn.evolus.training.app;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import vn.evolus.training.model.Circle;

public class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello World!"); //Display the string.
        
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

