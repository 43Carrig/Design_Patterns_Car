package strategy;

public class NoTransmission  implements TransmissionBehaviour{
    @Override
    public String gearShiftUp() {
        return "No Transmission.. No gear Shift Up";
    }

    @Override
    public String gearShiftDown() {
        return "No Transmission.. No gear Shift Down";

    }
}
