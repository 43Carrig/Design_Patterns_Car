package strategy;

public class SportsCar extends Car{
    @Override
    public String engine() {
        return "has Fast engine!";
    }

    @Override
    public String transmission() {
        return "has Manuel Transmission.";
    }
}
