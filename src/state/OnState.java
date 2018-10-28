package state;

import vehicles.Car;

public class OnState implements State {
    Car car;

    public OnState(Car car) { this.car = car;
    }

    @Override
    public void turnKeyToStartEngine() {
        System.out.println("The car has already been started!");
    }

    @Override
    public void accelerateCar() {
        System.out.println("The car is currently cruising!");
    }

    @Override
    public void brakeCar() {
        System.out.println("Can't break as you are not accelerating currently!");
    }

    @Override
    public void turnKeyToStopEngine() {
        System.out.println("Turning key to turn off and stop engine!");
    }
}
