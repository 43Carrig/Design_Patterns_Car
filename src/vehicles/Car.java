package vehicles;

import decorator.CarModification;
import state.State;
import strategy.*;

public class Car {

    private String model;
    private double price;

    // Decorator
    private CarModification modifications;

    // Strategy
    TransmissionBehaviour transmissionBehaviour;
    EngineBehaviour engineBehaviour;

    //State
    State onState;
    State offState;
    State accelerationState;
    State state;

    public Car(State onState, State offState, State accelerationState) {
        this.onState = onState;
        this.offState = offState;
        this.accelerationState = accelerationState;
    }

    public Car() {

    }

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getOnState() {
        return onState;
    }

    public void setOnState(State onState) {
        this.onState = onState;
    }

    public State getOffState() {
        return offState;
    }

    public void setOffState(State offState) {
        this.offState = offState;
    }

    public State getAccelerationState() {
        return accelerationState;
    }

    public void setAccelerationState(State accelerationState) {
        this.accelerationState = accelerationState;
    }

    public void startEngineState(){
        state.turnKeyToStartEngine();
    }

    public void stopEngineState(){
        state.turnKeyToStopEngine();
    }

    public void accelerate(){
        state.accelerateCar();
    }

    public void brake(){
        state.brakeCar();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + getModel() + '\'' +
                ", Price=" + getPrice() +
                '}';
    }

    public void gearUp() {
        transmissionBehaviour.gearShiftUp();
    }

    public void gearDown() {
        transmissionBehaviour.gearShiftDown();
    }

    public void startEngine() {
        engineBehaviour.start();
    }

    public void stopEngine() {
        engineBehaviour.stop();
    }

    public void setModifications(CarModification modifications) {
        this.modifications = modifications;
    }
}
