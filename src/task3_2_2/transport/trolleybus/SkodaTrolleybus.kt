package task3_2_2.transport.trolleybus

class SkodaTrolleybus: Trolleybus {
    override fun getPrice(): Double {
        return 6800000.0
    }

    override fun getCostPerKm(km: Double): Double {
        return 12.0*km
    }

    override fun getInfo() {
        println("This is Skoda Trolleybus")
    }
}