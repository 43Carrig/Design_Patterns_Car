package strategy;

public class ModelCar extends Car {

    @Override
    public String engine() {
        return "no engine";
    }

    @Override
    public String transmission() {
        return "no transmission";
    }

    public String start()
    {
        return "Engine can't start.. has no engine";
    }
    public String stop()
    {
        return "Engine can't stop.. has no engine";
    }
}
