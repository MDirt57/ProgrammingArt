package task_extra


fun main() {

    val t1 = Thread{
        Extra.getInstance()
    }
    val t2 = Thread{
        Extra.getInstance()
    }

    t1.start()
    t2.start()


}