package adapter;

public class NormalGearBox implements GearBox {

    @Override
    public String gearBoxChangingUp() {
        return "Normal gear box changing Up!";
    }

    @Override
    public String gearBoxChangingDown() {
        return "Normal gear box changing Down!";
    }

}
