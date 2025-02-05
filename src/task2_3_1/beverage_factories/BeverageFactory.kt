package task2_3_1.beverage_factories

import task2_3_1.Ingredient
import task2_3_1.beverages.Beverage

interface BeverageFactory {

    fun makeCoffee(components: List<Ingredient>, price: Double): Beverage
    fun pickComponents(): List<String>

}