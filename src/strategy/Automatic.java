package strategy;

public class Automatic implements TransmissionBehaviour {

    @Override
    public String gearShiftUp() {
        return "Automatically shifting up a gear";
    }

    @Override
    public String gearShiftDown() {
        return "Automatically shifting down a gear";
    }
}
