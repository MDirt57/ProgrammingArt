package task8_3_1.beverages;

import task8_3_1.ingredients.Ingredient;

import java.util.List;

public class Coffee extends Beverage {


    public Coffee(String label, List<Ingredient> ingredients) {
        super(label, ingredients);
        super.cost = 10;
    }

    @Override
    public void prepare() {
        System.out.println("Put some coffee...");
        super.prepare();
    }

}
