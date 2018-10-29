package template;

public class ExperiencedDriver extends Driver{

    @Override
    public void accelerate() {
        System.out.println("Experienced TemplateDriver accelerates!");
    }

    @Override
    public void brake() {
        System.out.println("Experienced TemplateDriver brakes!");
    }
}
