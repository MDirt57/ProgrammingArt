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
        String priceStr = calculator.calculatePrice(); // Отримуємо рядок "330USD"
        String numericPart = priceStr.replaceAll("[^0-9.]", ""); // Видаляємо всі нечислові символи
        float price = Float.parseFloat(numericPart); // Перетворюємо в число
        return price * usdToUah;
    }

    @Override
    public float tax(Auto auto) {
        String priceStr = calculator.calculatePrice(); // Отримуємо рядок "330USD"
        String numericPart = priceStr.replaceAll("[^0-9.]", ""); // Видаляємо всі нечислові символи
        float price = Float.parseFloat(numericPart); // Перетворюємо в число
        return price * taxCoefficient;
    }
}
