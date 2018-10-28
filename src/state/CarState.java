package state;

public class CarState {

    final static int Off_State = 0;
    final static int On_State = 1;
    final static int acceleration_state = 2;

    int state = Off_State;
    int count = 0;

    public CarState(int count) {
        this.count = count;
        if (count > 0) {
            state = Off_State;
        }
    }

    public void turnKeyToStart() {
        if (state == On_State) {
            System.out.println("On state. The car is already started!");
        } else if (state == Off_State) {
            state = On_State;
            System.out.println("Off state. The car is off!");
        } else if (state == acceleration_state) {
            System.out.println("Acceleration state. The car is already started!");
        }
    }

    public void accelerate() {
        if (state == On_State) {
            System.out.println("Is cruising!");
        } else if (state == Off_State) {
            System.out.println("You can't accelerate when the car is off!");
        } else if (state == acceleration_state) {
            System.out.println("You are already accelerating!");
        }

    }

    public void brake(){
        if (state == On_State) {
            System.out.println("There is no need to brake - you are not accelerating!");
        } else if (state == Off_State) {
            System.out.println("You can't brake when the car is off!");
        }
        else if (state == acceleration_state) {
            System.out.println("Slowing down...the car has stopped moving!");
            turnKeyToStop();
        }
    }

    public void turnKeyToStop(){
        if (state == On_State) {
            System.out.println("Engine state on. Turning key to stop");
            count = count - 1;
        } else if (state == Off_State) {
            System.out.println("Engine state off. Engine already stopped");
        }
        else if (state == acceleration_state) {
            System.out.println("Engine was accelerating. Turned key to stop engine.");
        }
    }

}




