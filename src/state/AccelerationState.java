package state;

import vehicles.Car;

public class AccelerationState implements State {
    Car car;

    public AccelerationState(Car car) {this.car = car;}

    @Override
    public void turnKeyToStartEngine() {
        System.out.println("The car is already started!");
    }

    @Override
    public void accelerateCar() {
        System.out.println("You are already accelerating the car!");
    }

    @Override
    public void brakeCar() {
        System.out.println("The car is slowing down.. The car has stopped moving!");
    }

    @Override
    public void turnKeyToStopEngine() {
        System.out.println("You can't turn off the car while it is accelerating!");
    }
}
