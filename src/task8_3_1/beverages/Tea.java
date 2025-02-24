package task8_3_1.beverages;

import task8_3_1.ingredients.Ingredient;

import java.util.List;

public class Tea extends Beverage {

    public Tea(String label, List<Ingredient> ingredients) {
        super(label, ingredients);
        super.cost = 7;
    }

    @Override
    public void prepare() {
        System.out.println("Put some tea...");
        super.prepare();
    }

}
