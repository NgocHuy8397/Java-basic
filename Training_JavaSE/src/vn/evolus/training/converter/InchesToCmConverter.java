package vn.evolus.training.converter;

public class InchesToCmConverter implements MetricSystemConverter {

    @Override
    public double handle(double value) {
        return value * 2.54;
    }
    
    @Override
    public String getName() {
        return "InchesToCmConverter";
    }

}
