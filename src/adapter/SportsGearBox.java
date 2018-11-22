package adapter;

public class SportsGearBox implements GearBox {

    @Override
    public String gearBoxChangingUp() {
        return "Sports gear box changing Up!";
    }

    @Override
    public String gearBoxChangingDown() {
        return "Sports gear box changing Down!";
    }
}
