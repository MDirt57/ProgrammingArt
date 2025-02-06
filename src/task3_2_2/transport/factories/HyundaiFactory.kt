package task3_2_2.transport.factories

import task3_2_2.transport.bus.Bus
import task3_2_2.transport.bus.HyundaiBus
import task3_2_2.transport.tram.HyundaiTram
import task3_2_2.transport.tram.Tram
import task3_2_2.transport.trolleybus.HyundaiTrolleybus
import task3_2_2.transport.trolleybus.Trolleybus

class HyundaiFactory: TransportFactory() {

    override fun makeBus(): Bus {
        return HyundaiBus()
    }

    override fun makeTram(): Tram {
        return HyundaiTram()
    }

    override fun makeTrolleybus(): Trolleybus {
        return HyundaiTrolleybus()
    }


}