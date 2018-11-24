package template;

public abstract class Driver {

    private String name;

    public Driver(String name)
    {
        this.name = name;
    }

    public String drive()
    {
        return accelerate() + brake();
    }

    public abstract String accelerate();

    public abstract String brake();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
