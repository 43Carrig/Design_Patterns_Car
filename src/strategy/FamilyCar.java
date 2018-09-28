package strategy;

public class FamilyCar extends Car{
    @Override
    public String engine() {
        return "Normal engine.";
    }

    @Override
    public String transmission() {
        return "Automatic transmission.";
    }
}
