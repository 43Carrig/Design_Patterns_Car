package vehicle_system_individual_drivers;

import template.*;

public class TemplateDriver {

    public static void main(String args[])
    {
        NewLearnerDriver newLearnerDriver = new NewLearnerDriver();

        ExperiencedDriver experiencedDriver = new ExperiencedDriver();

        System.out.println("----New Learner TemplateDriver...----\n");

        newLearnerDriver.drive();

        System.out.println("");

        System.out.println("----Experienced TemplateDriver...----\n");

        experiencedDriver.drive();
    }
}
