package task3_2_2.transport.bus

class VolvoBus: Bus {

    override fun getPrice(): Double {
        return 6000000.0
    }

    override fun getCostPerKm(km: Double): Double {
        return 20.0*km
    }

    override fun getInfo() {
        println("This is Volvo Bus")
    }


}