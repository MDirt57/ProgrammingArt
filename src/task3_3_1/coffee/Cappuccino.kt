package task3_3_1.coffee

class Cappuccino: Coffee() {

    override val ingredients: List<String>
        get() = listOf("water", "coffeeBins", "milk", "sugar")

    override val income: Double = 6.0

    override fun exist() {
        println("This is Cappuccino")
    }


}