package task3_2_2.transport.trolleybus

class HyundaiTrolleybus: Trolleybus {

    override fun getPrice(): Double {
        return 7000000.0
    }

    override fun getCostPerKm(km: Double): Double {
        return 11.0*km
    }

    override fun getInfo() {
        println("This is Hyundai Trolleybus")
    }

}