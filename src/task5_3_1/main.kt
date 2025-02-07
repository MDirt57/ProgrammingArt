package task5_3_1

import task5_3_1.equations.Equation
import task5_3_1.equations.QuadraticEquation

fun main() {

    val eq1 = Equation(1.0, 2.0)
    val eq2 = eq1.copy()
    val eq3 = eq1
    println("Equation1: $eq1\nEquation2: $eq2\nEquation3: $eq3")

    //Equation1: task5_3_1.equations.Equation@119d7047
    //Equation2: task5_3_1.equations.Equation@776ec8df
    //Equation3: task5_3_1.equations.Equation@119d7047

    val eq4 = QuadraticEquation(1.0, 2.0, 5.0)
    val eq5 = eq4.copy()
    val eq6 = eq4
    println("Equation4: $eq4\nEquation5: $eq5\nEquation6: $eq6")

    //Equation4: task5_3_1.equations.QuadraticEquation@3b07d329
    //Equation5: task5_3_1.equations.QuadraticEquation@41629346
    //Equation6: task5_3_1.equations.QuadraticEquation@3b07d329

}