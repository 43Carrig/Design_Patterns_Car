package strategy;

public class FamilyCar extends Car{
    @Override
    public String engine() {
        return "has Normal engine.";
    }

    @Override
    public String transmission() {
        return "has Automatic transmission.";
    }
}
