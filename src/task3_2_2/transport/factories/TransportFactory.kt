package task3_2_2.transport.factories

import task3_2_2.transport.bus.Bus
import task3_2_2.transport.tram.Tram
import task3_2_2.transport.trolleybus.Trolleybus

abstract class TransportFactory {

    abstract fun makeBus(): Bus
    abstract fun makeTram(): Tram
    abstract fun makeTrolleybus(): Trolleybus

    fun calculateCosts(
        busCount: Int,
        tramCount: Int,
        trolleybusCount: Int,
        km: Double
    ): Double{
        val busObject = makeBus()
        val tramObject = makeTram()
        val trolleybusObject = makeTrolleybus()

        return busCount*(busObject.getPrice()+busObject.getCostPerKm(km)) +
                tramCount *(tramObject.getPrice()+tramObject.getCostPerKm(km)) +
                trolleybusCount *(trolleybusObject.getPrice()+trolleybusObject.getCostPerKm(km))

    }

}