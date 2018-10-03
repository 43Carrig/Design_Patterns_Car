package decorator;

public class LeatherSeats extends ModDecorator{

    public LeatherSeats(CarModification carModification) {
        super(carModification);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1000;
    }

    public String toString()
    {return carModification.toString() + ".. Modification - Leather seats";}
}
