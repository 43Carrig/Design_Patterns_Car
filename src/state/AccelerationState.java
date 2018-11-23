package state;

import vehicles.*;

public class AccelerationState implements State {
    Car car;

    public AccelerationState(Car car) {this.car = car;}

    @Override
    public String turnKeyToStartEngine() {
        return "The car is already started!";
    }

    @Override
    public String accelerateCar() {
        return "You are already accelerating the car!";
    }

    @Override
    public String brakeCar() {
        return "The car is slowing down.. The car has stopped moving!";
    }

    @Override
    public String turnKeyToStopEngine() {
        return "You can't turn off the car while it is accelerating!";
    }
}
