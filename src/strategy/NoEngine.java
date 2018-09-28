package strategy;

public class NoEngine implements EngineBehaviour {
    @Override
    public String start() {
        return "Engine can't start.. has no engine";
    }

    @Override
    public String stop() {
        return "Stop.. has no engine";
    }

    @Override
    public String noEngine() {
        return "Car.. has no engine";
    }
}
