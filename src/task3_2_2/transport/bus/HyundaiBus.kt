package task3_2_2.transport.bus

class HyundaiBus: Bus {

    override fun getPrice(): Double {
        return 5500000.0
    }

    override fun getCostPerKm(km: Double): Double {
        return 20.0*km
    }

    override fun getInfo() {
        println("This is Hyundai Bus")
    }

}