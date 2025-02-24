package task8_3_1.ingredients;

public class Lime extends Ingredient{

    public Lime(int volume) {
        super(volume);
    }

    @Override
    public String getMeasurement() {
        return "wedge";
    }

    @Override
    public String getLabel() {
        return "lime";
    }
}
