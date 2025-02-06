package task3_2_2.transport.trolleybus

interface Trolleybus {

    fun getPrice(): Double
    fun getCostPerKm(km: Double): Double
    fun getInfo()

}