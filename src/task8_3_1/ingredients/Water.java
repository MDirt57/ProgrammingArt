package task8_3_1.ingredients;

public class Water extends Ingredient {

    public Water(int volume) {
        super(volume);
    }

    @Override
    public String getMeasurement() {
        return "ml";
    }

    @Override
    public String getLabel() {
        return "water";
    }
}
