package strategy;

public abstract class Car{

    TransmissionBehaviour transmissionBehaviour;
    EngineBehaviour engineBehaviour;

    public Car() {

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
