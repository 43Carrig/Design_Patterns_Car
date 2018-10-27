package factory;

import vehicles.Astra;
import vehicles.Car;

public class OpelFactory extends CarFactory {

    @Override
    public Car buildCar(CarType model)
    {
        Car c = null;

        if(model.equals(CarType.OPEL_ASTRA))
        {
            c = new Astra();
        }

        return c;
    }
}

