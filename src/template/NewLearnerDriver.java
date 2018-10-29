package template;

public class NewLearnerDriver extends Driver{

    public NewLearnerDriver(String name)
    {
        super(name);
    }

    @Override
    public void accelerate() {
        System.out.println("New Learner driver accelerates!");
    }

    @Override
    public void brake() {
        System.out.println("New Learner driver brakes!");

    }
}
