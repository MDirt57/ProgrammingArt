package task3_3_1.coffee_machine

import task3_3_1.coffee.Americano
import task3_3_1.coffee.Cappuccino
import task3_3_1.coffee.Coffee
import task3_3_1.coffee.Latte

class NanoMachine : CoffeeMachine() {

    override val price: Double
        get() = 10000.0
    override val servicePricePerDay: Double
        get() = 1.0
    override var income: Double = 0.0

    override fun makeAmericano(): Coffee {
        val americano = Americano()
        income += americano.income
        return americano
    }

    override fun makeLatte(): Coffee {
        val latte = Latte()
        income += latte.income
        return latte
    }

    override fun makeCappuccino(): Coffee {
        val cappuccino = Cappuccino()
        income += cappuccino.income
        return cappuccino
    }

}