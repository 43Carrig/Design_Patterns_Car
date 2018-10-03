package factory;

public class CarFactory {

    public CarType createCar(String type)
    {
        if(type.toLowerCase().equals("opel"))
        {
            return new Opel();
        }
        else if(type.toLowerCase().equals("ford"))
        {
            return new Ford();
        }
        return null;
    }
}
