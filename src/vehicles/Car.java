package vehicles;

public abstract class Car {

    private String model;
    private double price;


    public Car() {

    }

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + getModel() + '\'' +
                ", Price=" + getPrice() +
                '}';
    }
}
