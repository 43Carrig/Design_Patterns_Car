package strategy;

public class ModelCar extends CarBehaviour {

    public ModelCar()
    {
        engineBehaviour = new NoEngine();
        transmissionBehaviour = new NoTransmission();
    }
}
