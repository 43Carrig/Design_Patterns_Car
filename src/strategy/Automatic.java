package strategy;

public class Automatic implements TransmissionBehaviour {

    @Override
    public void gearShiftUp() {
        System.out.println("Automatically shifting up a gear");
    }

    @Override
    public void gearShiftDown() {
        System.out.println("Automatically shifting down a gear");
    }
}
