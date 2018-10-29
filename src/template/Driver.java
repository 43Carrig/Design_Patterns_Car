package template;

public class Driver {

    public static void main(String args[])
    {
        NewLearnerDriver newLearnerDriver = new NewLearnerDriver();

        ExperiencedDriver experiencedDriver = new ExperiencedDriver();

        System.out.println("----New Learner Driver...----\n");

        newLearnerDriver.drive();

        System.out.println("");

        System.out.println("----Experienced Driver...----\n");

        experiencedDriver.drive();
    }
}
