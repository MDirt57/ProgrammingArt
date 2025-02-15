package task6_3_2


class Wheel: Cloneable {

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
        return "${this.hashCode()}-Wheel - shape: $shape; tire: $tire\n"
    }

    override fun copy(): Wheel{
        return Wheel(this.shape, this.tire)
    }

}