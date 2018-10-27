package factory;

import vehicles.Car;

public abstract class CarFactory {

        public abstract Car buildCar(CarType model);
}
