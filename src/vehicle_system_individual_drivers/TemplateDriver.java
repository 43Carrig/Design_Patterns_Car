package vehicle_system_individual_drivers;

import template.*;

public class TemplateDriver {

    public static void main(String args[])
    {
        System.out.println("----Template Driver...----\n");

        Driver newLearnerDriver = new NewLearnerDriver("Sean");
        System.out.println(newLearnerDriver.getName());

        System.out.println("");

        System.out.println("---New Driver---");
        newLearnerDriver.drive();
    }
}
