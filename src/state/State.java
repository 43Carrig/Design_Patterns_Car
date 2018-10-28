package state;

public interface State {
    void turnKeyToStartEngine();
    void accelerateCar();
    void brakeCar();
    void turnKeyToStopEngine();
}
