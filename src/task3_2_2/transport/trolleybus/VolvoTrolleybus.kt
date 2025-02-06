package task3_2_2.transport.trolleybus

class VolvoTrolleybus: Trolleybus {

    override fun getPrice(): Double {
        return 7000000.0
    }

    override fun getCostPerKm(km: Double): Double {
        return 13.0*km
    }

    override fun getInfo() {
        println("This is Volvo Trolleybus")
    }


}