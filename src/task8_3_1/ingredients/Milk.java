package task8_3_1.ingredients;

public class Milk extends Ingredient{

    public Milk(int volume) {
        super(volume);
    }

    @Override
    public String getMeasurement() {
        return "ml";
    }

    @Override
    public String getLabel() {
        return "milk";
    }
}
