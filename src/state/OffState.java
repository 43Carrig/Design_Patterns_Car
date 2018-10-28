package state;

import vehicles.Car;

public class OffState implements State{
    Car car;

    public OffState(Car car)
    {
        this.car = car;
    }

    @Override
    public void turnKeyToStartEngine() {
        System.out.println("Engine state is off. Starting engine!");
    }

    @Override
    public void accelerateCar() {
        System.out.println("Car can't accelerate when when the engine state is off!");
    }

    @Override
    public void brakeCar() {
        System.out.println("Car can't break when the engine is off!");
    }

    @Override
    public void turnKeyToStopEngine() {
        System.out.println("Engine can't be turned off when the engine hasn't started!");
    }
}
