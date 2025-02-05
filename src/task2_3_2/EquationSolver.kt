package task2_3_2

import task2_3_2.equation_factories.EquationFactory
import task2_3_2.equations.BiQuadraticEquation
import task2_3_2.equations.Equation
import task2_3_2.equations.QuadraticEquation

class EquationSolver {

    val noSolution = mutableListOf<List<Double>>()
    val oneSolution = mutableListOf<List<Double>>()
    val twoSolution = mutableListOf<List<Double>>()
    val threeSolution = mutableListOf<List<Double>>()
    val fourSolution = mutableListOf<List<Double>>()
    val infinitySolution = mutableListOf<List<Double>>()

    var currentMax: Pair<List<Double>, Double>? = null
    var currentMin: Pair<List<Double>, Double>? = null

    fun addEquation(factory: EquationFactory, params: List<Double>){
        checkMinMax(factory, params)
        when (factory.getNumberOfSolutions(params)){
            0 -> noSolution.add(params)
            1 -> oneSolution.add(params)
            2 -> twoSolution.add(params)
            3 -> threeSolution.add(params)
            4 -> fourSolution.add(params)
            else -> infinitySolution.add(params)
        }
    }

    fun checkMinMax(factory: EquationFactory, params: List<Double>){
        try {
            val solutions = factory.getEquation(params).solve()
            val minimum = currentMin?.second
            val maximum = currentMax?.second
            if (solutions.isNotEmpty() && (minimum == null || solutions.min() < minimum)){
                currentMin = Pair(params, solutions.min())
            }

            if (solutions.isNotEmpty() && (maximum == null || solutions.max() < maximum)){
                currentMax = Pair(params, solutions.max())
            }
        } catch (_: IllegalArgumentException){}
    }

    override fun toString(): String {
        return "No solution: $noSolution\n" +
                "One solution: $oneSolution\n" +
                "Two solutions: $twoSolution\n" +
                "Three solutions: $threeSolution\n" +
                "Four solutions: $fourSolution\n" +
                "Infinity solutions: $infinitySolution\n" +
                "Minimum: $currentMin; Maximum: $currentMax\n"
    }

}