package vn.evolus.training.app;

public enum Day {

    SUNDAY("Sunday"), MONDAY("Monday");
    
    private String title;
    
    Day(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
}
