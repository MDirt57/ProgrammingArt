package task3_2_2.transport.bus

class SkodaBus: Bus {
    override fun getPrice(): Double {
        return 4500000.0
    }

    override fun getCostPerKm(km: Double): Double {
        return 25.0*km
    }

    override fun getInfo() {
        println("This is Skoda Bus")
    }
}