
package factory;

import vehicles.Car;
import vehicles.Fiesta;

public class FordFactory extends CarFactory {

    @Override
    public Car buildCar(CarType model)
    {
        Car car = null;

        if(model.equals(CarType.FORD_FIESTA))
        {
            car = new Fiesta();
        }

        return car;
    }

}
