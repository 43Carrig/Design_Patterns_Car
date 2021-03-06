package observer;

import vehicles.Car;

import java.util.List;

public class CarLocation implements Subject {
    private List<Observer> observers;
    private double longitude;
    private double latitude;

    public CarLocation(List<Observer> observers)
    {
        this.observers = observers;
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers)
        {
            o.update(longitude, latitude);
        }
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
        notifyObservers();
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
        notifyObservers();
    }

    public int carObserverCount()
    {
        return observers.size();
    }
}
