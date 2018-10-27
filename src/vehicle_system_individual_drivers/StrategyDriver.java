package vehicle_system_individual_drivers;

import strategy.*;

public class StrategyDriver {
    public static void main(String args[])
    {
        System.out.println();
        CarBehaviour familyCar = new FamilyCar();
        System.out.println("Family car is " + familyCar.getTransmissionBehaviour());

        System.out.println();
        CarBehaviour sportsCar = new SportsCar();
        System.out.println("Sports car is " + sportsCar.getEngineBehaviour());

        System.out.println();
        CarBehaviour modelCar = new ModelCar();
        modelCar.setEngineBehaviour(new NoEngine());
        System.out.println(modelCar.getEngineBehaviour());

        System.out.println();
        sportsCar.setEngineBehaviour(new NoEngine());
        System.out.println("Sports car " + sportsCar.getEngineBehaviour());

        System.out.println();
        sportsCar.setTransmissionBehaviour(new NoTransmission());
        System.out.println(sportsCar.getTransmissionBehaviour());
    }
}
