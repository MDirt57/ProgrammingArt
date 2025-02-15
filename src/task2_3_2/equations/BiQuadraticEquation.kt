package task2_3_2.equations

import kotlin.math.sqrt

class BiQuadraticEquation(
    a: Double,
    b: Double,
    c: Double
) : QuadraticEquation(a, b, c) {

    // ax^4 + bx^2 + c = 0
    override fun solve(): List<Double> {
        checkParameters()
        //quadratic roots
        if (a == 0.0 && b == 0.0) {
            return listOf()
        }

        val D = b * b - 4 * a * c

        val solution = mutableListOf<Double>()

        if (D == 0.0){
            val sol = -b / (2*a)
            if (sol > 0){
                solution.add(sqrt(sol))
                solution.add(-sqrt(sol))
            }else if (sol == 0.0){
                solution.add(0.0)
            }
        } else if (D > 0.0){

            val sol1 = -b + sqrt(D) / (2 * a)
            val sol2 = -b - sqrt(D) / (2 * a)
            if (sol1 > 0.0){
                solution.add(sqrt(sol1))
                solution.add(-sqrt(sol1))
            }

            if (sol2 > 0.0){
                solution.add(sqrt(sol2))
                solution.add(-sqrt(sol2))
            }
        }
        return solution
    }

}