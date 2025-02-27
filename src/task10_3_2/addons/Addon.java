package task10_3_2.addons;

import task10_3_2.Beverage;

public class Addon extends Beverage {

    final private Beverage beverage;

    public Addon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description();
    }

    public float cost(){
        return beverage.cost();
    }

}
