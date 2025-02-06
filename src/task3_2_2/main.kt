package task3_2_2

import task3_2_2.factories.HyundaiFactory
import task3_2_2.factories.SkodaFactory
import task3_2_2.factories.VolvoFactory


fun main(){

    val km = 10000.0
    val busCount = 3
    val tramCount = 5
    val trolleybusCount = 1

    val volvo = VolvoFactory()
    val skoda = SkodaFactory()
    val hyundai = HyundaiFactory()

    println("Volvo costs: ${volvo.calculateCosts(busCount, tramCount, trolleybusCount, km)}")
    println("Skoda costs: ${skoda.calculateCosts(busCount, tramCount, trolleybusCount, km)}")
    println("Hyundai costs: ${hyundai.calculateCosts(busCount, tramCount, trolleybusCount, km)}")

}