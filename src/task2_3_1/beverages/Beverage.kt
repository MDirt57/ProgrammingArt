package task2_3_1.beverages


abstract class Beverage{

    abstract var selfPrice: Double
    abstract var servicePrice: Double

    fun calculatePrice(): Double{
        return servicePrice + selfPrice
    }

}