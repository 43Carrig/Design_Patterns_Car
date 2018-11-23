package state;

public interface State {
    String turnKeyToStartEngine();
    String accelerateCar();
    String brakeCar();
    String turnKeyToStopEngine();
}
