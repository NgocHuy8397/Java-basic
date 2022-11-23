package vn.evolus.training.app;

public class Outer {
    private String name = "Outer";
    private int value = 10;
    
    public String getName() {
        Inner inner = new Inner();
        return inner.getName();
    }
    
    public class Inner {
        private String name = "Inner";
        
        public String getName() {
            return Outer.this.name + "." + name + " - value: " + value;
        } 
    }
    
    public static class StaticInner {
        public String getName() {
            return "StaticInner";
        }
    }
    
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.getName());
        
        Inner inner = outer.new Inner();
        System.out.println("Inner name: " + inner.getName());
    }
}
