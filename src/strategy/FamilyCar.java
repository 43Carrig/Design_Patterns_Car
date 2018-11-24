package strategy;

public class FamilyCar extends CarBehaviour {

    public FamilyCar() {
        transmissionBehaviour = new Automatic();
        engineBehaviour = new StandardEngine();
    }
}
