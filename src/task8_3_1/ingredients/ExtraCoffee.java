package task8_3_1.ingredients;

public class ExtraCoffee extends Ingredient {

    public ExtraCoffee(int volume) {
        super(volume);
    }

    @Override
    public String getMeasurement() {
        return "gr";
    }

    @Override
    public String getLabel() {
        return "extracoffee";
    }
}
