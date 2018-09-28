package strategy;

public class CarSystemDriver{
    public static void main(String args[])
    {
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
        System.out.println(sportsCar.getTransmissionBehaviour());
    }
}
