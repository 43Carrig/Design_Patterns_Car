package strategy;

public class TurboEngine implements EngineBehaviour{

    @Override
    public void start() {
        System.out.println("Turbo engine has started!");
    }

    @Override
    public void stop() {
        System.out.println("Turbo engine has stopped.");
    }

    @Override
    public void noEngine() {
        System.out.println("Turbo engine has an engine");
    }
}
