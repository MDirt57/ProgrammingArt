package task7_3_2;

import libsSrc.VehicleCalculator.lib.src.main.java.com.customs.Auto;
import libsSrc.VehicleCalculator.lib.src.main.java.com.customs.Customs;
import libsSrc.VehicleCalculator.lib.src.main.java.com.vehiclecalculator.CarCalculator;
import libsSrc.VehicleCalculator.lib.src.main.java.com.vehiclecalculator.Vehicle;
import libsSrc.VehicleCalculator.lib.src.main.java.com.vehiclecalculator.VehicleCalculator;

public class UkrainianCustoms implements Customs {

    public UkrainianCustoms(VehicleCalculator calculator){ this.calculator = calculator; }

    final VehicleCalculator calculator;
    private float usdToUah = 40.0f;
    private float taxCoefficient = 0.2f;

    @Override
    public float vehiclePrice(Auto auto) {
        calculator.setVehicle(new AdapterAutoToVehicle(auto));
        String priceStr = calculator.calculatePrice();
        String numericPart = priceStr.replaceAll("[^0-9.]", "");
        float price = Float.parseFloat(numericPart);
        return price * usdToUah;
    }

    @Override
    public float tax(Auto auto) {
        calculator.setVehicle(new AdapterAutoToVehicle(auto));
        String priceStr = calculator.calculatePrice();
        String numericPart = priceStr.replaceAll("[^0-9.]", "");
        float price = Float.parseFloat(numericPart);
        return price * taxCoefficient;
    }
}
