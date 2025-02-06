package task3_2_2.transport.tram

class VolvoTram: Tram {

    override fun getPrice(): Double {
        return 10000000.0
    }

    override fun getCostPerKm(km: Double): Double {
        return 7.0*km
    }

    override fun getInfo() {
        println("This is Volvo Tram")
    }


}