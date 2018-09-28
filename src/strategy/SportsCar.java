package strategy;

public class SportsCar extends Car{
    @Override
    public String engine() {
        return "Fast engine!";
    }

    @Override
    public String transmission() {
        return "Manuel Transmission.";
    }
}
