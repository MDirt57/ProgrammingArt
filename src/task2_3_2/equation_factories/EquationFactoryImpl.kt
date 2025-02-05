package task2_3_2.equation_factories

import task2_3_2.equations.Equation

class EquationFactoryImpl: EquationFactory() {

    override fun getEquation(params: List<Double>): Equation {
        return Equation(params[0], params[1])
    }

}