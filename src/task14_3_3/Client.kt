package task14_3_3

import task14_3_3.handlers.AddHandler
import task14_3_3.handlers.MultHandler
import task14_3_3.handlers.SubHandler

fun main(){

    val conditions = listOf(
        Triple(2, '+', 1),
        Triple(5, '*', 100),
        Triple(2, '-', -11),
        Triple(3, '/', 3),
    )

    val handler = AddHandler()
    handler
        .setNext(SubHandler())
        .setNext(MultHandler())

    conditions.forEach {
        println(handler.handle(it.first, it.third, it.second))
    }

}