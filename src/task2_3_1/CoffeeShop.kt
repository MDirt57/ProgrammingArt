package task2_3_1

import task2_3_1.beverages.Beverage
import task2_3_1.beverage_factories.BeverageFactory

class CoffeeShop {

    private val history = mutableListOf<Beverage>()
    private val components = mapOf(
        "water" to Ingredient("water", 5.0),
        "coffeeBins" to Ingredient("coffeeBins", 20.0),
        "milk" to Ingredient("milk", 15.0),
        "teabag" to Ingredient("teabag", 3.0),
        "sugar" to Ingredient("sugar", 2.0),
    )

    fun getComponents(labels: List<String>): List<Ingredient>{
        val components_ = mutableListOf<Ingredient>()
        labels.forEach { label ->
            components_.add(components[label] ?: Ingredient("", 0.0))
        }
        return components_
    }

    fun makeCoffee(beverageFactory: BeverageFactory){
        val beverage = beverageFactory.makeCoffee(getComponents(beverageFactory.pickComponents()), 10.0)
        history.add(beverage)
    }

    fun calculateIncome(): Double{
        return history.sumOf { it.calculatePrice() }
    }

}