package task3_3_1.coffee



abstract class Coffee {

    abstract val ingredients: List<String>
    abstract val income: Double

    abstract fun exist()
}