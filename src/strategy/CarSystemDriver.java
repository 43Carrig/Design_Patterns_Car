package strategy;

public class CarSystemDriver {
    public static void main(String args[])
    {
        Car familyCar = new FamilyCar();
        System.out.println("Family car " + familyCar.start());
        System.out.println("Family car " + familyCar.engine());

        Car sportsCar = new SportsCar();
        System.out.println("Sports Car " + sportsCar.stop());
        System.out.println("Sports Car " + sportsCar.transmission());
    }
}
