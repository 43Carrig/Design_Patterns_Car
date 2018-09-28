package strategy;

public class StandardEngine implements EngineBehaviour {

    @Override
    public void start() {
        System.out.println("Standard engine has started, ready to drive!");
    }

    @Override
    public void stop() {
        System.out.println("Standard engine has stopped.");
    }

    @Override
    public void noEngine() {
        System.out.println("Standard engine has an engine");;
    }
}
