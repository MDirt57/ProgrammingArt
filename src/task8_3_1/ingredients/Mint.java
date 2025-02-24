package task8_3_1.ingredients;

public class Mint extends Ingredient{
    public Mint(int volume) {
        super(volume);
    }

    @Override
    public String getMeasurement() {
        return "gr";
    }

    @Override
    public String getLabel() {
        return "mint";
    }
}
