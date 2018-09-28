package strategy;

public class EnhancedEngine implements EngineBehaviour{
    @Override
    public void start() {
        System.out.println("Enhanced engine starting!");
    }

    @Override
    public void stop() {
        System.out.println("Enhanced engine has stopped.");
    }

    @Override
    public void noEngine() {
        System.out.println("Car has engine");
    }
}
