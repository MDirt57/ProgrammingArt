package task3_2_2.factories

import task3_2_2.transport.bus.Bus
import task3_2_2.transport.bus.VolvoBus
import task3_2_2.transport.tram.Tram
import task3_2_2.transport.tram.VolvoTram
import task3_2_2.transport.trolleybus.Trolleybus
import task3_2_2.transport.trolleybus.VolvoTrolleybus

class VolvoFactory: TransportFactory() {

    override fun makeBus(): Bus {
        return VolvoBus()
    }

    override fun makeTram(): Tram {
        return VolvoTram()
    }

    override fun makeTrolleybus(): Trolleybus {
        return VolvoTrolleybus()
    }


}