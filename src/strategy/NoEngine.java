package strategy;

public class NoEngine implements EngineBehaviour {
    @Override
    public void start() {
        System.out.println("Engine can't start.. has no engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop.. has no engine");
    }

    @Override
    public void noEngine() {
        System.out.println("Car.. has no engine");;
    }
}
