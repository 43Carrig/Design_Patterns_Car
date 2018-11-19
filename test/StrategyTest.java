import strategy.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void TestStrategy()
    {
        CarBehaviour familyCar = new FamilyCar();

        Assert.assertEquals("Family car is Automatically shifting down a gear","Family car is " + familyCar.getTransmissionBehaviour());
        Assert.assertNotEquals("Sport car is Manually shifting up","Family car is " + familyCar.getTransmissionBehaviour());

        CarBehaviour sportsCar = new SportsCar();

        Assert.assertEquals("Sports car is Turbo engine has started!","Sports car is " + sportsCar.getEngineBehaviour());
        Assert.assertNotEquals("Sports car has no Turbo engine!","Sports car is " + sportsCar.getEngineBehaviour());

        CarBehaviour modelCar = new ModelCar();
        modelCar.setEngineBehaviour(new NoEngine());

        Assert.assertEquals("Engine can't start.. has no engine", modelCar.getEngineBehaviour());
        Assert.assertNotEquals("Engine can start.. has engine", modelCar.getEngineBehaviour());

        sportsCar.setEngineBehaviour(new NoEngine());
        Assert.assertEquals("Sports car Engine can't start.. has no engine","Sports car " + sportsCar.getEngineBehaviour());
        Assert.assertNotEquals("Sports car Engine can start.. has engine","Sports car " + sportsCar.getEngineBehaviour());

        sportsCar.setTransmissionBehaviour(new NoTransmission());
        Assert.assertEquals("No Transmission.. No gear Shift Down",sportsCar.getTransmissionBehaviour());
        Assert.assertNotEquals("Has Transmission.. Gear Shift Down",sportsCar.getTransmissionBehaviour());
    }
}
