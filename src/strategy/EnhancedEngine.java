package strategy;

public class EnhancedEngine implements EngineBehaviour {
    @Override
    public String start() {
        return "Enhanced engine starting!";
    }

    @Override
    public String stop() {
        return "Enhanced engine has stopped.";
    }

    @Override
    public String noEngine() {
        return "CarType has engine";
    }
}
