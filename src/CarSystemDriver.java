import factory.CarFactory;
import factory.CarType;
import factory.Ford;
import factory.Opel;
import strategy.*;


public class CarSystemDriver{
    public static void main(String args[])
    {

        CarType fordFactory = new Ford();
        System.out.println("Ford.." + fordFactory.getColor());

        CarType opelFactory = new Opel();
        System.out.println("Opel.." + opelFactory.getModel());

        CarFactory carFactory = new CarFactory();

        String typeOpel = "Opel";
        CarType carOpel = carFactory.createCar(typeOpel);
        System.out.println("CarType is " + carOpel.getType());

        String typeFord = "Ford";
        CarType carFord = carFactory.createCar(typeFord);
        System.out.println(carFord.getColor());

        String typeFord1 = "Ford";
        CarType carFord1 = carFactory.createCar(typeFord1);
        System.out.println(carFord.getModel());

/*
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
*/
    }
}
