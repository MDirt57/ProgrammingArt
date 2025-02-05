package task2_3_1.beverage_factories

import task2_3_1.Ingredient
import task2_3_1.beverages.Americano
import task2_3_1.beverages.Beverage
import task2_3_1.beverages.Cappuccino

class AmericanoFactory: BeverageFactory {

    override fun makeCoffee(components: List<Ingredient>, price: Double): Beverage {
        val cappuccino = Cappuccino()
        cappuccino.selfPrice = components.sumOf { it.price }
        cappuccino.servicePrice = price

        return cappuccino
    }

    override fun pickComponents(): List<String> = listOf("water", "coffeeBins")
}