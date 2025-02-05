package task3_3_1.coffee

class Americano: Coffee() {

    override val ingredients: List<String>
        get() = listOf("water", "coffeeBins")

    override val income: Double = 5.0

    override fun exist() {
        println("This is Americano")
    }


}