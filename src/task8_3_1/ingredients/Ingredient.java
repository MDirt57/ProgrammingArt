package task8_3_1.ingredients;

public abstract class Ingredient {

    protected int volume;
    public Ingredient(int volume){ this.volume = volume; }

    public int getVolume(){
        return volume;
    }

    abstract public String getMeasurement();
    abstract public String getLabel();

}
