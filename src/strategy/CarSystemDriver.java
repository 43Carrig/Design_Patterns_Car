package strategy;

import factory.CarFactory;
import factory.FordFactory;
import factory.OpelFactory;
import javax.swing.*;


public class CarSystemDriver{
    public static void main(String args[])
    {

        CarFactory fordFactory = new FordFactory();
        System.out.println("Ford.." + fordFactory.CarColor());

        CarFactory opelFactory = new OpelFactory();
        System.out.println("Opel.." + opelFactory.CarModel());

        /*
        System.out.println();
        Car familyCar = new FamilyCar();
        System.out.println("Family car is " + familyCar.getTransmissionBehaviour());

        System.out.println();
        Car sportsCar = new SportsCar();
        System.out.println("Sports car is " + sportsCar.getEngineBehaviour());

        System.out.println();
        Car modelCar = new ModelCar();
        modelCar.setEngineBehaviour(new NoEngine());
        System.out.println(modelCar.getEngineBehaviour());

        System.out.println();
        sportsCar.setEngineBehaviour(new NoEngine());
        System.out.println("Sports car " + sportsCar.getEngineBehaviour());

        System.out.println();
        sportsCar.setTransmissionBehaviour(new NoTransmission());
        System.out.println(sportsCar.getTransmissionBehaviour());*/

    }
}
