package factory;

public abstract class CarType {

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return "CarType Factory is finished producing an " + this.getType();
    }

    public String getColor() {
        return "CarType Factory is painting a " + this.getType();
    }
}

