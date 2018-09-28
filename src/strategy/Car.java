package strategy;

public abstract class Car{

    TransmissionBehaviour transmissionBehaviour;
    EngineBehaviour engineBehaviour;

    public Car() {

    }

    public void setTransmissionBehaviour(TransmissionBehaviour transmissionBehaviour) {
        this.transmissionBehaviour = transmissionBehaviour;
    }

    public TransmissionBehaviour getTransmissionBehaviour() {
        return transmissionBehaviour;
    }

    public EngineBehaviour getEngineBehaviour() {
        return engineBehaviour;
    }

    public void setEngineBehaviour(EngineBehaviour engineBehaviour) {
        this.engineBehaviour = engineBehaviour;
    }


}
