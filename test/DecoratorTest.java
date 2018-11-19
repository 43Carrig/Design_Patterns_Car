import decorator.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    public void TestDecorator()
    {
        CarModification carModification = new Modification();

        Assert.assertEquals(3000, carModification.getPrice(),0);
        Assert.assertNotEquals(3500 ,carModification.getPrice());
        Assert.assertEquals("vehicles.Car Modifications.. " + 3000.0,carModification.toString() + ".. " + carModification.getPrice());

        carModification = new Alloys(carModification);

        Assert.assertEquals(6000, carModification.getPrice(),0);
        Assert.assertNotEquals(6500, carModification.getPrice());
        Assert.assertEquals("vehicles.Car Modifications.. Modification - Alloys.. 6000.0",carModification.toString() + ".. " + carModification.getPrice());

        carModification = new LeatherSeats(carModification);

        Assert.assertEquals(7000.0, carModification.getPrice(),0);
        Assert.assertNotEquals(7000,carModification.getPrice());
        Assert.assertEquals("vehicles.Car Modifications.. Modification - Alloys.. Modification - Leather seats.. 7000.0",carModification.toString() + ".. " + carModification.getPrice());
    }
}
