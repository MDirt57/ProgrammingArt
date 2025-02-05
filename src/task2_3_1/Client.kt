package task2_3_1

import task2_3_1.beverage_factories.AmericanoFactory
import task2_3_1.beverage_factories.TeaFactory
import task2_3_1.beverage_factories.CappuccinoFactory


fun main(){

    val shop = CoffeeShop()
    val cappuccinoFactory = CappuccinoFactory()
    val teaFactory = TeaFactory()

    shop.makeCoffee(cappuccinoFactory)
    shop.makeCoffee(cappuccinoFactory)
    shop.makeCoffee(teaFactory)
    println(shop.calculateIncome())

    shop.makeCoffee(cappuccinoFactory)
    println(shop.calculateIncome())

    shop.makeCoffee(AmericanoFactory())
    shop.makeCoffee(AmericanoFactory())
    println(shop.calculateIncome())

}