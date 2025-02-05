package task2_3_2.equation_factories

import task2_3_2.equations.Equation
import task2_3_2.equations.QuadraticEquation

class QuadraticFactory: EquationFactory() {

    override fun getEquation(params: List<Double>): Equation {
        return QuadraticEquation(params[0], params[1], params[2])
    }

}