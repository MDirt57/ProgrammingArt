package task6_3_2


class Engine: Cloneable {

    enum class EngineType {
        DIESEL,
        HYBRID,
        ROTARY,
        GASOLINE
    }

    class Builder{

        private var engineType: EngineType = EngineType.DIESEL

        fun setEngineType(engineType: EngineType): Builder{
            this.engineType = engineType
            return this
        }

        fun build(): Engine{
            return Engine(engineType)
        }

    }

    private val engineType: EngineType

    private constructor(engineType: EngineType){
        this.engineType = engineType
    }

    override fun toString(): String {
        return "${this.hashCode()}-Engine - type: $engineType\n"
    }

    override fun copy(): Engine{
        return Engine(this.engineType)
    }

}