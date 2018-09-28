package strategy;

public abstract class Car{

    public String start()
    {
        return "Engine has started and is ready";
    }
    public String stop()
    {
        return "Engine has stopped";
    }
    public abstract String engine();

    public abstract String transmission();
}
