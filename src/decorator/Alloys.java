package decorator;

public class Alloys extends ModDecorator{

    public Alloys(CarModification carModification) {
        super(carModification);
    }

    public double getPrice() {
        return carModification.getPrice() + 3000;
    }

    @Override
    public String toString() {
        return carModification.toString() + ".. Modification - Alloys" ;
    }
}
