package state;

import vehicles.Car;

public class OnState implements State {
    Car car;

    public OnState(Car car) { this.car = car;
    }

    @Override
    public String turnKeyToStartEngine() {
        return "The car has already been started!";
    }

    @Override
    public String accelerateCar() {
        return "The car is currently cruising!";
    }

    @Override
    public String brakeCar() {
        return "Can't break as you are not accelerating currently!";
    }

    @Override
    public String turnKeyToStopEngine() {
        return "Turning key to turn off and stop engine!";
    }
}
