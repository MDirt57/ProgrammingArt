package task1_3_1

class CarSimulator {

    private val carConfig = CarBuilder()
    private val myCar = Car()

    fun go(){
        println("Car go forward")
    }

    fun construct(){
        carConfig.setMockCar(myCar)
        carConfig.setWheel(Wheel())
        carConfig.setEngine(Engine())
    }

}