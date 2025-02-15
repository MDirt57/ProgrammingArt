package task6_3_2



object Director {

    fun makeRandomCar1(): Car{
        val body = Body.Builder()
            .setColor(Body.Color.RED)
            .setType(Body.BodyType.CROSSOVER)
            .build()
        val engine = Engine.Builder()
            .setEngineType(Engine.EngineType.HYBRID)
            .build()

        return Car.Builder()
            .setBody(body)
            .setEngine(engine)
            .build()
    }


    fun makeRandomCar2(): Car{
        val body = Body.Builder()
            .setColor(Body.Color.GREEN)
            .build()
        val engine = Engine.Builder()
            .setEngineType(Engine.EngineType.ROTARY)
            .build()
        val wheel = Wheel.Builder()
            .setTire(Wheel.Tire.MUD)
            .build()

        return Car.Builder()
            .setBody(body)
            .setEngine(engine)
            .setWheel(wheel)
            .build()
    }

    fun makeRandomCar3(): Car{
        return Car.Builder()
            .build()
    }


}