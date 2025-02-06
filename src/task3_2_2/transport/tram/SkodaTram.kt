package task3_2_2.transport.tram

class SkodaTram: Tram {
    override fun getPrice(): Double {
        return 9000000.0
    }

    override fun getCostPerKm(km: Double): Double {
        return 8.0*km
    }

    override fun getInfo() {
        println("This is Skoda Tram")
    }
}