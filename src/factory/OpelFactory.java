package factory;

import vehicles.Astra;
import vehicles.Car;

public class OpelFactory extends CarFactory {

    @Override
    public Car buildCar(CarType model)
    {
        Car car = null;

        if(model.equals(CarType.OPEL_ASTRA))
        {
            car = new Astra();
        }

        return car;
    }
}

