package task3_3_1.coffee

class Latte: Coffee() {

    override val ingredients: List<String>
        get() = listOf("water", "coffeeBins", "milk")

    override val income: Double = 10.0

    override fun exist() {
        println("This is Latte")
    }

}