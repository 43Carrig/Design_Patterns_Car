package factory;

public abstract class CarFactory {

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String CarModel() {
        return "Car Factory is finished producing an " + this.getType();
    }

    public String CarColor() {
        return "Car Factory is painting a " + this.getType();
    }
}

