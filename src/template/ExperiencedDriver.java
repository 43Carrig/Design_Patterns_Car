package template;

public class ExperiencedDriver extends Driver{

    public ExperiencedDriver(String name)
    {
        super(name);
    }

    @Override
    public String accelerate() {
        return "Experienced TemplateDriver accelerates!";
    }

    @Override
    public String brake() {

        return "Experienced TemplateDriver brakes!";
    }
}
