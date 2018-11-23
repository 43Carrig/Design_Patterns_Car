import factory.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import vehicles.Car;

public class FactoryTest {

    @org.junit.Test
    public void TestFactory()
    {
        CarFactory fordFactory = new FordFactory();
        CarFactory opelFactory = new OpelFactory();

        Car fiesta = fordFactory.buildCar(CarType.FORD_FIESTA);
        Car astra = opelFactory.buildCar(CarType.OPEL_ASTRA);

        Assert.assertEquals(15000.0,fiesta.getPrice(),0);

        Assert.assertEquals("Fiesta",fiesta.getModel());

        Assert.assertEquals(20000,astra.getPrice(),0);

        Assert.assertEquals("Astra",astra.getModel());

        Assert.assertEquals("Car{Model='Fiesta', Price=15000.0}", fiesta.toString());

        Assert.assertEquals("Car{Model='Astra', Price=20000.0}", astra.toString());
    }
}
