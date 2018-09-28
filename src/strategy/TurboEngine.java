package strategy;

public class TurboEngine implements EngineBehaviour {

    @Override
    public String start() {
        return "Turbo engine has started!";
    }

    @Override
    public String stop() {
        return "Turbo engine has stopped.";
    }

    @Override
    public String noEngine() {
        return "Turbo engine has an engine";
    }
}
