package task7_3_2;

import libsSrc.VehicleCalculator.lib.src.main.java.com.customs.Auto;
import libsSrc.VehicleCalculator.lib.src.main.java.com.vehiclecalculator.Vehicle;

public class AdapterAutoToVehicle extends Vehicle {

    public AdapterAutoToVehicle(Auto auto){
        super(auto.age, auto.model, auto.damaged ? 0.2f : 1.0f , auto.mileage);
    }

}
