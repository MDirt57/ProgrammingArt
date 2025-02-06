package task4_3_1

import task4_3_1.Body.BodyType
import task4_3_1.Body.Color


class Wheel {

    enum class Shape{
        CIRCLE,
        SQUARE,
        TRIANGLE
    }

    enum class Tire{
        WINTER,
        HIGHWAY,
        SUMMER,
        MUD
    }

    class Builder{

        private var shape: Shape = Shape.CIRCLE
        private var tire: Tire = Tire.HIGHWAY

        fun setShape(shape: Shape): Builder{
            this.shape = shape
            return this
        }

        fun setTire(tire: Tire): Builder{
            this.tire = tire
            return this
        }

        fun build(): Wheel{
            return Wheel(shape, tire)
        }

    }


    private val shape: Shape
    private val tire: Tire

    private constructor(shape: Shape, tire: Tire){
        this.shape = shape
        this.tire = tire
    }

    override fun toString(): String {
        return "Wheel - shape: $shape; tire: $tire\n"
    }

}