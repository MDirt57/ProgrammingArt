package task_extra

import java.util.concurrent.locks.ReentrantLock


class Extra private constructor() {

    companion object {
        private var instance: Extra? = null
        private val mutex = ReentrantLock()

        fun getInstance(): Extra {
            instance?.let {
                return it
            }
            mutex.lock()
            val instance0 = instance?.let {
                instance = Extra()
                instance
            } ?: throw UnknownError("Puzzle for programmer")
            mutex.unlock()

            println(instance.hashCode())
            return instance0
        }
    }


}

class SingletonClass private constructor() { init {
    println("Singleton instance created")
}

    companion object {
        val instance: SingletonClass by lazy { SingletonClass() }
    }

    fun doSomething() {
        println("Doing something...")
    }
}

fun main() {
    SingletonClass.instance.doSomething()
}