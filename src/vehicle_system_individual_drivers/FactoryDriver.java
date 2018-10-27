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

        System.out.println("----Factory Pattern------\n");

        System.out.println("----Fiesta-----\n");
        System.out.println(fiesta.toString());

        System.out.println("----Astra-----\n");
        System.out.println(astra.toString());

        /*
        CarType fordFactory = new FordFactory();
        System.out.println("FordFactory.." + fordFactory.getColor());

        CarType opelFactory = new OpelFactory();
        System.out.println("OpelFactory.." + opelFactory.getModel());

        CarFactory carFactory = new CarFactory();

        String typeOpel = "OpelFactory";
        CarType carOpel = carFactory.createCar(typeOpel);
        System.out.println("CarType is " + carOpel.getType());

        String typeFord = "FordFactory";
        CarType carFord = carFactory.createCar(typeFord);
        System.out.println(carFord.getColor());

        String typeFord1 = "FordFactory";
        CarType carFord1 = carFactory.createCar(typeFord1);
        System.out.println(carFord.getModel());*/
    }
}
