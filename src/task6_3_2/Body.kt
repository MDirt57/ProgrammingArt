package task6_3_2



class Body: Cloneable {

    enum class BodyType{
        SEDAN,
        COUPE,
        SUV,
        VAN,
        CROSSOVER
    }

    enum class Color{
        BLUE,
        RED,
        YELLOW,
        GREEN,
        WHITE,
        BLACK
    }

    class Builder{

        private var type: BodyType = BodyType.SEDAN
        private var color: Color = Color.BLACK

        fun setType(type: BodyType): Builder{
            this.type = type
            return this
        }

        fun setColor(color: Color): Builder{
            this.color = color
            return this
        }

        fun build(): Body{
            return Body(type, color)
        }

    }


    private val type: BodyType
    private val color: Color

    private constructor(type: BodyType, color: Color){
        this.type = type
        this.color = color
    }

    override fun toString(): String {
        return "${this.hashCode()}-Body - type: $type; color: $color\n"
    }

    override fun copy(): Body{
        return Body(this.type, this.color)
    }

}