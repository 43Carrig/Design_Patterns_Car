package observer;

public class LocationObserver implements Observer {
    private double longitude;
    private double latitude;
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

    public void getCarLocation(){
        System.out.println("Car position is - \nLongitude: " + longitude + "\nLatitude" + latitude);
    }
}
