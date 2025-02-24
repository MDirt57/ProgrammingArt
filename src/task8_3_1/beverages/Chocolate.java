package task8_3_1.beverages;

import task8_3_1.ingredients.Ingredient;

import java.util.List;

public class Chocolate extends Beverage {

    public Chocolate(String label, List<Ingredient> ingredients) {
        super(label, ingredients);
        super.cost = 15;
    }

    @Override
    public void prepare() {
        System.out.println("Put some cacao...");
        super.prepare();
    }

}
