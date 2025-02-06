package task3_2_2.transport.tram

interface Tram {

    fun getPrice(): Double
    fun getCostPerKm(km: Double): Double
    fun getInfo()

}