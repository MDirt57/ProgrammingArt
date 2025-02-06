package task3_2_2.transport.bus

interface Bus {

    fun getPrice(): Double
    fun getCostPerKm(km: Double): Double
    fun getInfo()

}