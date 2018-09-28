package strategy;

public class FamilyCar extends Car{



    public FamilyCar() {
        transmissionBehaviour = new Automatic();
        engineBehaviour = new StandardEngine();
    }
}
