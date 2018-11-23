import adapter.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import strategy.TransmissionBehaviour;

public class AdapterTest {

    @Test
    public void TestAdapter()
    {
        TransmissionBehaviour sportsGearBox = new GearBoxAdapter(new SportsGearBox());

        TransmissionBehaviour normalGearBox = new GearBoxAdapter(new NormalGearBox());

        Assert.assertEquals("Sports gear box changing Down!",sportsGearBox.gearShiftDown());
        Assert.assertNotEquals("Sports gear box changing Up!",sportsGearBox.gearShiftDown());

        Assert.assertEquals("Sports gear box changing Up!",sportsGearBox.gearShiftUp());
        Assert.assertNotEquals("Sports gear box changing Down!",sportsGearBox.gearShiftUp());

        Assert.assertEquals("Normal gear box changing Down!",normalGearBox.gearShiftDown());
        Assert.assertNotEquals("Sports gear box changing Up!",normalGearBox.gearShiftDown());

        Assert.assertEquals("Normal gear box changing Up!",normalGearBox.gearShiftUp());
        Assert.assertNotEquals("Sports gear box changing Down!",normalGearBox.gearShiftUp());
    }
}
