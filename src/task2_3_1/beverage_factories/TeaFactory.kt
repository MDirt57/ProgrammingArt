package task2_3_1.beverage_factories

import task2_3_1.Ingredient
import task2_3_1.beverages.Beverage
import task2_3_1.beverages.Tea

class TeaFactory: BeverageFactory {

    override fun makeCoffee(components: List<Ingredient>, price: Double): Beverage {
        val tea = Tea()
        tea.selfPrice = components.sumOf { it.price }
        tea.servicePrice = price

        return tea
    }

    override fun pickComponents() = listOf("water", "teabag", "sugar")
}