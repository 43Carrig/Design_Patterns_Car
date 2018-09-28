package strategy;

public class StandardEngine implements EngineBehaviour {

    @Override
    public String start() {
        return "Standard engine has started, ready to drive!";
    }

    @Override
    public String stop() {
        return "Standard engine has stopped.";
    }

    @Override
    public String noEngine() {
        return "Standard engine has an engine";
    }
}
