package vehicle_system_individual_drivers;

import decorator.*;
import vehicles.Car;
import vehicles.Fiesta;

public class DecoratorDriver {

public static void main(String args[])
{
    // decorator

    CarModification carModification = new Modification();
    System.out.println(carModification.toString() + ".. " + carModification.getPrice());

    carModification = new Alloys(carModification);
    System.out.println(carModification.toString() + ".. " + carModification.getPrice());

    carModification = new LeatherSeats(carModification);
    System.out.println(carModification.toString() + ".. " +carModification.getPrice());
}
}
