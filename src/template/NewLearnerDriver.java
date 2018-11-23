package template;

public class NewLearnerDriver extends Driver{

    public NewLearnerDriver(String name)
    {
        super(name);
    }

    @Override
    public String accelerate() {

        return "New Learner driver accelerates!";
    }

    @Override
    public String brake() {
        return "New Learner driver brakes!";

    }
}
