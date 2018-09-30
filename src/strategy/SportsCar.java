package strategy;

public class SportsCar extends CarBehaviour {

    public SportsCar(){
        transmissionBehaviour = new Manual();
        engineBehaviour = new TurboEngine();
    }
}
