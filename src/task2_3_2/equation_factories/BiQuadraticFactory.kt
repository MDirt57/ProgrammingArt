package task2_3_2.equation_factories

import task2_3_2.equations.BiQuadraticEquation
import task2_3_2.equations.Equation
import task2_3_2.equations.QuadraticEquation

class BiQuadraticFactory: EquationFactory() {

    override fun getEquation(params: List<Double>): Equation {
        return BiQuadraticEquation(params[0], params[2], params[4])
    }

}