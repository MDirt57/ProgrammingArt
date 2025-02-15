package task2_3_2.equations

import kotlin.math.sqrt

open class QuadraticEquation(
    val a: Double,
    b: Double,
    c: Double
) : Equation(b, c) {

    // ax^2 + bx + c = 0
    override fun solve(): List<Double> {
        if (a == 0.0){
            return super.solve()
        }

        val D = b * b - 4 * a * c

        return if (D < 0) {
            listOf()
        } else if (D == 0.0) {
            listOf(-b / (2 * a))
        } else {
            listOf(-b + sqrt(D) / (2 * a), -b - sqrt(D) / (2 * a))
        }
    }

}