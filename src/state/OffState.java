package state;

import vehicles.Car;

public class OffState implements State{
    Car car;

    public OffState(Car car)
    {
        this.car = car;
    }

    @Override
    public String turnKeyToStartEngine() {
        return "Engine state is off. Starting engine!";
    }

    @Override
    public String accelerateCar() {
        return "Car can't accelerate when when the engine state is off!";
    }

    @Override
    public String brakeCar() {
        return "Car can't break when the engine is off!";
    }

    @Override
    public String turnKeyToStopEngine() {
        return "Engine can't be turned off when the engine hasn't started!";
    }
}
