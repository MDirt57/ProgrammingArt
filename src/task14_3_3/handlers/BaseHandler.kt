package task14_3_3.handlers

open class BaseHandler: Handler {

    private var next: Handler? = null

    override fun setNext(next: Handler): Handler {
        this.next = next
        return next
    }

    override fun handle(num1: Int, num2: Int, operation: Char): Int? {
        next?.let {
            return it.handle(num1, num2, operation)
        }
        return null
    }
}