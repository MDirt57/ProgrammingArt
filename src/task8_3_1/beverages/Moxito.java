package task8_3_1.beverages;

import task8_3_1.ingredients.Ingredient;

import java.util.List;

public class Moxito extends Beverage {

    public Moxito(String label, List<Ingredient> ingredients) {
        super(label, ingredients);
        super.cost = 12;
    }

}
