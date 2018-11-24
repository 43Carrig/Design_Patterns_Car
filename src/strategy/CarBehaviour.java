package strategy;

public abstract class CarBehaviour {

    protected TransmissionBehaviour transmissionBehaviour;
    protected EngineBehaviour engineBehaviour;

    public CarBehaviour() {

    }

    public void setTransmissionBehaviour(TransmissionBehaviour transmissionBehaviour) {
        this.transmissionBehaviour = transmissionBehaviour;
    }

    public String getTransmissionBehaviour() {
        return transmissionBehaviour.gearShiftDown();
    }


    public String getEngineBehaviour() {
        return engineBehaviour.start();
    }

    public void setEngineBehaviour(EngineBehaviour engineBehaviour) {
        this.engineBehaviour = engineBehaviour;
    }

}
