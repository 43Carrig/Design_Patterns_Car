package vehicle_system_individual_drivers;

import observer.*;
import observer.LocationObserver;

import java.util.ArrayList;

public class ObserverDriver {

    public static void main(String args[])
    {
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
