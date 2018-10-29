package template;

public class ExperiencedDriver extends Driver{

    public ExperiencedDriver(String name)
    {
        super(name);
    }

    @Override
    public void accelerate() {
        System.out.println("Experienced TemplateDriver accelerates!");
    }

    @Override
    public void brake() {
        System.out.println("Experienced TemplateDriver brakes!");
    }
}
