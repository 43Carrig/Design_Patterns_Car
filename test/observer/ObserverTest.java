package observer;

//import static org.hamcrest.CoreMatchers.not;
import static org.junit.jupiter.api.Assertions.*;
import observer.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

class ObserverTest {

    @Test
    public void testObserver()
    {
        CarLocation mainCarLocation = new CarLocation(new ArrayList<Observer>());

        Assert.assertEquals(0, mainCarLocation.carObserverCount());

        LocationObserver carLocationObserver = new LocationObserver(mainCarLocation);

        Assert.assertNotEquals(0, mainCarLocation.carObserverCount());
        Assert.assertEquals(1, mainCarLocation.carObserverCount());

        mainCarLocation.setLongitude(15.3);
        mainCarLocation.setLatitude(12.1);
        Assert.assertEquals("Car position is - Longitude: 15.3 Latitude: 12.1", carLocationObserver.getCarLocation());
        Assert.assertNotEquals("Car position is - Longitude: 151.3 Latitude: 12.3", carLocationObserver.getCarLocation());

        mainCarLocation.unregister(carLocationObserver);
        Assert.assertNotEquals(1, mainCarLocation.carObserverCount());
        Assert.assertEquals(0, mainCarLocation.carObserverCount());

        LocationObserver carLocationObserverAnother = new LocationObserver(mainCarLocation);
        mainCarLocation.register(carLocationObserverAnother);

        Assert.assertNotEquals(1, mainCarLocation.carObserverCount());
        Assert.assertEquals(2, mainCarLocation.carObserverCount());

        mainCarLocation.register(carLocationObserverAnother);

        Assert.assertNotEquals(2, mainCarLocation.carObserverCount());
        Assert.assertEquals(3, mainCarLocation.carObserverCount());
    }
}