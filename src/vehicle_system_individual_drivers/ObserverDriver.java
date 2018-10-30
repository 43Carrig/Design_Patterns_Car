package vehicle_system_individual_drivers;

import observer.*;
import observer.LocationObserver;
import template.Driver;
import template.NewLearnerDriver;
import vehicles.Car;
import vehicles.Fiesta;

import java.util.ArrayList;
import java.util.List;

public class ObserverDriver {

    public static void main(String args[])
    {
//        List<Car> car = new ArrayList<>();
//
//        Car fiesta = new Fiesta();
//        Driver driver = new NewLearnerDriver("Sean");

        CarLocation mainCarLocation = new CarLocation(new ArrayList<Observer>());
        LocationObserver carLocationObserver = new LocationObserver(mainCarLocation);

        mainCarLocation.setLongitude(15.3);
        mainCarLocation.setLatitude(12.1);

        System.out.println("--- Car Location ---");
        carLocationObserver.getCarLocation();

        System.out.println();

        mainCarLocation.setLongitude(15.3);

        System.out.println("--- Unregister Car Location ---");
        mainCarLocation.unregister(carLocationObserver);
        System.out.println(mainCarLocation.carObserverCount());

        System.out.println();

        System.out.println("--- Register Car Location ---");
        mainCarLocation.register(carLocationObserver);
        System.out.println(mainCarLocation.carObserverCount());

        System.out.println();

        System.out.println("--- Register Car Location ---");
        mainCarLocation.register(carLocationObserver);
        System.out.println(mainCarLocation.carObserverCount());
    }

}
