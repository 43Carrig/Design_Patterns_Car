package vehicle_system_individual_drivers;

import vehicles.Car;
import vehicles.Fiesta;
import state.*;

public class StateDriver {
    public static void main(String[] args) {

        Car fiesta = new Fiesta();

        System.out.println("--State Pattern - Car changing states--\n");

        System.out.println("--On State - accelerating car--");

        OnState onState = new OnState(fiesta);
        onState.accelerateCar();

        System.out.println("--Acceleration State - accelerating car--");

        AccelerationState accelerationState = new AccelerationState(fiesta);
        accelerationState.accelerateCar();

        System.out.println("--Off state - brake--\n");
        OffState offState = new OffState(fiesta);
        offState.brakeCar();
    }
}

