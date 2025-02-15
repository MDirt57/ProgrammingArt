package task4_3_1



class Body {

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

        fun setType(type: BodyType) = apply { this.type = type }
        fun setColor(color: Color) = apply { this.color = color }

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
        return "Body - type: $type; color: $color\n"
    }

}