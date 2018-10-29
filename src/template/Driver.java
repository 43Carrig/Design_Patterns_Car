package template;

public abstract class Driver {

    String name;

    public Driver(String name)
    {
        this.name = name;
    }

    public void drive()
    {
        accelerate();
        brake();
    }

    abstract void accelerate();

    abstract void brake();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
