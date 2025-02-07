package task5_3_1.equations

open class Equation(
    val b: Double,
    val c: Double,
): CloneableEquation {

    protected open fun checkParameters(){
        if (b == 0.0 && c == 0.0){
            throw IllegalArgumentException("Infinity solutions")
        }
    }

    // bx + c = 0
    open fun solve(): List<Double>{
        checkParameters()
        if (b == 0.0){
            return listOf()
        }
        return listOf(-c/b)
    }

    override fun copy(): Equation {
        return Equation(this.b, this.c)
    }

}