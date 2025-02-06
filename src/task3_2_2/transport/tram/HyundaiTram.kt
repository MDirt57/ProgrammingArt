package task3_2_2.transport.tram

class HyundaiTram: Tram {

    override fun getPrice(): Double {
        return 9500000.0
    }

    override fun getCostPerKm(km: Double): Double {
        return 6.0*km
    }

    override fun getInfo() {
        println("This is Hyundai Tram")
    }

}