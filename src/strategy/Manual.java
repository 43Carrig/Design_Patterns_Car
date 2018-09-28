package strategy;

public class Manual implements TransmissionBehaviour {
    @Override
    public String gearShiftUp() {
        return "Manually shifting up a gear";
    }

    @Override
    public String gearShiftDown() {
        return "Manually shifting down a gear";
    }
}
