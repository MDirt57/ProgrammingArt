package task2_3_2

import task2_3_2.equation_factories.BiQuadraticFactory
import task2_3_2.equation_factories.EquationFactoryImpl
import task2_3_2.equation_factories.QuadraticFactory
import task2_3_2.equations.BiQuadraticEquation
import java.io.File


fun main() {
    val path = System.getProperty("user.dir")

    for (i in 1..3){
        val paramList = File("$path\\src\\task2_3_2\\inputs\\input0$i.txt").readLines()
        val solver = EquationSolver()
        for (params in paramList){
            val paramsList = params
                .split("\\s+".toRegex())
                .filter { it.isNotBlank() }
                .map { it.toDouble() }
            when (paramsList.size){
                2 -> solver.addEquation(EquationFactoryImpl(), paramsList)
                3 -> solver.addEquation(QuadraticFactory(), paramsList)
                5 -> solver.addEquation(BiQuadraticFactory(), paramsList)
            }
        }
        println(solver)
    }


}