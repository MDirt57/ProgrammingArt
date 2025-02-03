package task1_3_1

class CarBuilder {

    private lateinit var mockCar: Car

    fun setMockCar(car: Car){
        mockCar = car
    }

    fun setWheel(wheel: Wheel){
        println("Imagine this")
    }

    fun setEngine(engine: Engine){
        println("Abstract set engine")
    }

}