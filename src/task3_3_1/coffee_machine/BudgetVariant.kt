package task3_3_1.coffee_machine

import task3_3_1.coffee.Americano
import task3_3_1.coffee.Cappuccino
import task3_3_1.coffee.Coffee
import task3_3_1.coffee.Latte

class BudgetVariant : CoffeeMachine() {
    override val price: Double
        get() = 100.0
    override val servicePricePerDay: Double
        get() = 5.0
    override var income: Double = 0.0

    override fun makeAmericano(): Coffee {
        val americano = Americano()
        income += americano.income/10
        return americano
    }

    override fun makeLatte(): Coffee {
        val latte = Latte()
        income += latte.income/5
        return latte
    }

    override fun makeCappuccino(): Coffee {
        val cappuccino = Cappuccino()
        income += cappuccino.income/10
        return cappuccino
    }
}