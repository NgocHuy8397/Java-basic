package vn.evolus.training.converter;

public interface MetricSystemConverter {
    double handle(double value);
    
    default String getName() {
        return "MetricSystemConverter";
    }
}
