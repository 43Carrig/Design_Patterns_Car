import state.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import vehicles.*;

public class StateTest {

    @Test
    public void TestState()
    {
        Car fiesta = new Fiesta();

        OnState onState = new OnState(fiesta);

        Assert.assertEquals("The car is currently cruising!", onState.accelerateCar());
        Assert.assertNotEquals("You are already accelerating the car!",onState.accelerateCar());

        AccelerationState accelerationState = new AccelerationState(fiesta);

        Assert.assertEquals("You are already accelerating the car!", accelerationState.accelerateCar());
        Assert.assertNotEquals("The car is currently cruising!",accelerationState.accelerateCar());

        OffState offState = new OffState(fiesta);

        Assert.assertEquals("Car can't break when the engine is off!", offState.brakeCar());
        Assert.assertNotEquals("The car has already been started!", offState.brakeCar());

        Assert.assertEquals("The car has already been started!", onState.turnKeyToStartEngine());
        Assert.assertNotEquals("Car can't break when the engine is off!", onState.turnKeyToStartEngine());

        Assert.assertEquals("You can't turn off the car while it is accelerating!", accelerationState.turnKeyToStopEngine());
        Assert.assertNotEquals("Car can't break when the engine is off!", accelerationState.turnKeyToStopEngine());
    }
}
