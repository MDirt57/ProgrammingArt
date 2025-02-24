package task8_3_1.ingredients;

public class Sugar extends Ingredient{

    public Sugar(int volume) {
        super(volume);
    }

    static public Sugar sugar(){
        return new Sugar(3);
    }

    @Override
    public String getMeasurement() {
        return "gr";
    }

    @Override
    public String getLabel() {
        return "sugar";
    }
}
