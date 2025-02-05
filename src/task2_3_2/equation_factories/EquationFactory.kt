package task2_3_2.equation_factories

import task2_3_2.equations.BiQuadraticEquation
import task2_3_2.equations.Equation


abstract class EquationFactory {

    fun getNumberOfSolutions(params: List<Double>): Int?{
        val equation = getEquation(params)
        return try {
            equation.solve().size
        }catch (e: IllegalArgumentException){
            null
        }
    }

    abstract fun getEquation(params: List<Double>): Equation

}