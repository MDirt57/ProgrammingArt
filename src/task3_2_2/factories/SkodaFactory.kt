package task3_2_2.factories

import task3_2_2.transport.bus.Bus
import task3_2_2.transport.bus.SkodaBus
import task3_2_2.transport.tram.SkodaTram
import task3_2_2.transport.tram.Tram
import task3_2_2.transport.trolleybus.SkodaTrolleybus
import task3_2_2.transport.trolleybus.Trolleybus


class SkodaFactory: TransportFactory() {
    override fun makeBus(): Bus {
        return SkodaBus()
    }

    override fun makeTram(): Tram {
        return SkodaTram()
    }

    override fun makeTrolleybus(): Trolleybus {
        return SkodaTrolleybus()
    }
}