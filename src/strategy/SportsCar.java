package strategy;

public class SportsCar extends Car{

    public SportsCar(){
        transmissionBehaviour = new Manual();
        engineBehaviour = new TurboEngine();
    }
}
