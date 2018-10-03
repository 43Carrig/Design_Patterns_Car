package decorator;

public abstract class ModDecorator extends Modification{
    protected CarModification carModification;

    public ModDecorator(CarModification carModification)
    {
        this.carModification = carModification;
    }

    @Override
    public double getPrice() {
        return carModification.getPrice();
    }
}
