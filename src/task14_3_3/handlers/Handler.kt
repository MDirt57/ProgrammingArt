package task14_3_3.handlers

interface Handler {

    fun setNext(next: Handler): Handler
    fun handle(num1: Int, num2: Int, operation: Char): Int?

}