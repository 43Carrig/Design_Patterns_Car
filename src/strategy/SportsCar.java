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

    public String start()
    {
        return "Engine has started and is ready";
    }
    public String stop()
    {
        return "Engine has stopped";
    }
}
