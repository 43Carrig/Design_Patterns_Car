package strategy;

public abstract class Car{

    public String start()
    {
        return "Engine started and ready";
    }
    public String stop()
    {
        return "Engine stopped";
    }
    public abstract String engine();

    public abstract String transmission();
}
