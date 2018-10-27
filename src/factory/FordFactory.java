
package factory;

import vehicles.Car;
import vehicles.Fiesta;

public class FordFactory extends CarFactory {

    @Override
    public Car buildCar(CarType model)
    {
        Car c = null;

        if(model.equals(CarType.FORD_FIESTA))
        {
            c = new Fiesta();
            c.setPrice(15000);
        }

        return c;
    }

}
