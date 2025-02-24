package task8_3_1.beverages;

import task8_3_1.ingredients.Ingredient;

import java.util.List;

public class Beverage {

    protected final String label;
    protected final List<Ingredient> ingredients;
    protected int cost;

    public Beverage(String label, List<Ingredient> ingredients) {
        this.label = label;
        this.ingredients = ingredients;
    }

    public void prepare(){
        for (Ingredient ingredient: ingredients){
            System.out.println("Put "+ingredient.getLabel()+": "+ingredient.getVolume()+" "+ingredient.getMeasurement()+"...");
        }
    }

    public void drink(){
        System.out.println("Drink "+label+"!");
    }

    public int cost(){
        return this.cost;
    }
}
