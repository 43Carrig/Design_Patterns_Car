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

    public String start()
    {
        return "Engine has started and is ready";
    }
    public String stop()
    {
        return "Engine has stopped";
    }
}
