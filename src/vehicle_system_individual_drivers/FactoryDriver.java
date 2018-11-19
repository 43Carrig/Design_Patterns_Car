package vehicle_system_individual_drivers;

import factory.*;
import vehicles.Car;

public class FactoryDriver {
    public static void main(String args[])
    {
      // factory

        CarFactory fordFactory = new FordFactory();
        CarFactory opelFactory = new OpelFactory();

        Car fiesta = fordFactory.buildCar(CarType.FORD_FIESTA);
        Car astra = opelFactory.buildCar(CarType.OPEL_ASTRA);

        System.out.println("----Factory Pattern-----\n");

        System.out.println("----Fiesta-----\n");
        System.out.println(fiesta.toString());

        System.out.println("----Astra-----\n");
        System.out.println(astra.toString());

        System.out.println(fiesta.getPrice());
        System.out.println(fiesta.getModel());
    }
}
