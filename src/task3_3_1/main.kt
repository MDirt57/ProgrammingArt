package task3_3_1

import task3_3_1.coffee_machine.BudgetVariant
import task3_3_1.coffee_machine.CyberlifeMachine
import task3_3_1.coffee_machine.NanoMachine

fun testMachines(days: Int){
    println("Days: $days")

    val myDreamMachine = NanoMachine()
    val yourDreamMachine = CyberlifeMachine()
    val ourActualMachine = BudgetVariant()

    myDreamMachine.justMakeIt(days)
    yourDreamMachine.justMakeIt(days)
    ourActualMachine.justMakeIt(days)

    println("NanoMachine income = ${myDreamMachine.getIncome(days)}")
    println("CyberlifeMachine income = ${yourDreamMachine.getIncome(days)}")
    println("BudgetVariant income = ${ourActualMachine.getIncome(days)}")
    println()
}

fun main(){

    testMachines(7)
    testMachines(30)
    testMachines(365)

}