package task3_3_1.coffee_machine

import task3_3_1.coffee.Coffee

abstract class CoffeeMachine {

    abstract val price: Double
    abstract val servicePricePerDay: Double
    abstract var income: Double

    abstract fun makeAmericano(): Coffee
    abstract fun makeLatte(): Coffee
    abstract fun makeCappuccino(): Coffee

    fun getIncome(days: Int): Double {
        return income - price - servicePricePerDay * days
    }

    fun justMakeIt(days: Int){
        for (i in 1..5*days){
            makeAmericano()
        }
        for (i in 1..3*days){
            makeLatte()
        }
        for (i in 1..4*days){
            makeCappuccino()
        }
    }

}