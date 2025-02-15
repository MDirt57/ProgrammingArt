package task6_3_2

class Car: Cloneable {

    class Builder{

        private var body: Body = Body.Builder().build()
        private var wheel: Wheel = Wheel.Builder().build()
        private var engine: Engine = Engine.Builder().build()

        fun setBody(body: Body): Builder{
            this.body = body
            return this
        }

        fun setWheel(wheel: Wheel): Builder{
            this.wheel = wheel
            return this
        }

        fun setEngine(engine: Engine): Builder{
            this.engine = engine
            return this
        }

        fun build(): Car{
            return Car(body, wheel, engine)
        }

    }


    private val body: Body
    private val wheel: Wheel
    private val engine: Engine

    private constructor(body: Body, wheel: Wheel, engine: Engine){
        this.body = body
        this.wheel = wheel
        this.engine = engine
    }

    override fun toString(): String {
        return "${this.hashCode()}-Car\n$body$wheel$engine\n"
    }

    override fun copy(): Car{
        return Car(this.body.copy(), this.wheel.copy(), this.engine.copy())
    }

}