package vehicle_system_individual_drivers;

import adapter.GearBoxAdapter;
import adapter.NormalGearBox;
import adapter.SportsGearBox;
import strategy.TransmissionBehaviour;
import vehicles.Car;
import vehicles.Fiesta;

public class AdapterDriver {
    public static void main(String args[])
    {
        TransmissionBehaviour sportsGearBox = new GearBoxAdapter(new SportsGearBox());

        TransmissionBehaviour normalGearBox = new GearBoxAdapter(new NormalGearBox());

        System.out.println(sportsGearBox.gearShiftDown());

        System.out.println(sportsGearBox.gearShiftUp());

        System.out.println(normalGearBox.gearShiftDown());

        System.out.println(normalGearBox.gearShiftUp());

        //*****************************************************

        Car fiesta = new Fiesta();

        System.out.println("GearBox before adapter used!");
        fiesta.startEngine();
        fiesta.stopEngine();

        System.out.println("Adapted Gear Box");

        System.out.println("Sports Gear Box");
        fiesta.setGearBox(sportsGearBox);
        fiesta.gearUp();

        fiesta.getTransmissionBehaviour();

        fiesta.gearDown();

        fiesta.getTransmissionBehaviour();

        System.out.println("Normal Gear Box");
        fiesta.setGearBox(normalGearBox);
        fiesta.gearUp();
        fiesta.gearDown();
    }
}
