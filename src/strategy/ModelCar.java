package strategy;

public class ModelCar extends Car {

    public ModelCar()
    {
        engineBehaviour = new NoEngine();
        transmissionBehaviour = new NoTransmission();
    }
}
