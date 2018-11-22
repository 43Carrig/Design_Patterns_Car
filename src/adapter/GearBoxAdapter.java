package adapter;

import strategy.TransmissionBehaviour;

public class GearBoxAdapter implements TransmissionBehaviour {

    private GearBox gearBox;

    public GearBoxAdapter(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    @Override
    public String gearShiftUp() {

        return gearBox.gearBoxChangingUp();

    }

    @Override
    public String gearShiftDown() {
        return gearBox.gearBoxChangingDown();
    }
}
