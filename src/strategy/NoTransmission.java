package strategy;

public class NoTransmission  implements TransmissionBehaviour{
    @Override
    public void gearShiftUp() {
        System.out.println("No Transmission.. No gear Shift Up");
    }

    @Override
    public void gearShiftDown() {
        System.out.println("No Transmission.. No gear Shift Down");
    }
}
