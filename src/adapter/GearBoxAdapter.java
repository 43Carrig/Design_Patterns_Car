package adapter;

import strategy.TransmissionBehaviour;

public class GearBoxAdapter implements TransmissionBehaviour {

    GearBox gearBox;

    @Override
    public String gearShiftUp() {

        return gearBox.gearBoxChangingUp();

    }

    @Override
    public String gearShiftDown() {
        return gearBox.gearBoxChangingDown();
    }
}
