package observer;

public class LocationObserver implements Observer {
    double longitude;
    double latitude;
    Subject carLocation;

    public LocationObserver(Subject carLocation)
    {
        this.carLocation = carLocation;

        carLocation.register(this);
    }

    @Override
    public void update(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void getCarLocation(){
        System.out.println("Car position is - \nLongitude: " + getLongitude() + "\nLatitude" + getLatitude());
    }
}
