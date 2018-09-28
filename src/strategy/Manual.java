package strategy;

public class Manual implements TransmissionBehaviour {
    @Override
    public void gearShiftUp() {
        System.out.println("Manually shifting up a gear");
    }

    @Override
    public void gearShiftDown() {
        System.out.println("Manually shifting down a gear");
    }
}
