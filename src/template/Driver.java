package template;

public abstract class Driver {

    public Driver()
    {

    }

    public void drive()
    {
        accelerate();
        brake();
    }

    abstract void accelerate();

    abstract void brake();
}
