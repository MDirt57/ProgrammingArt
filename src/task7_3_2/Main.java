package task7_3_2;

import libsSrc.VehicleCalculator.lib.src.main.java.com.customs.Auto;
import libsSrc.VehicleCalculator.lib.src.main.java.com.vehiclecalculator.CarCalculator;
import libsSrc.VehicleCalculator.lib.src.main.java.com.vehiclecalculator.Vehicle;
import libsSrc.VehicleCalculator.lib.src.main.java.com.vehiclecalculator.VehicleCalculator;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(5, "Audi", 0.2f, 100_000);
        VehicleCalculator calculator = new CarCalculator();
        calculator.setVehicle(vehicle);
        System.out.println(calculator.calculatePrice());

        Auto auto = new Auto(10, "Ford", true, 100_000);
        Auto auto1 = new Auto(0, "Tesla", false, 0);
        UkrainianCustoms customs = new UkrainianCustoms(calculator);
        System.out.println(customs.vehiclePrice(auto));
        System.out.println(customs.tax(auto));

        System.out.println(customs.vehiclePrice(auto1));
        System.out.println(customs.tax(auto1));

    }


}
