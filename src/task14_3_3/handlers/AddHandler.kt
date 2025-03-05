package task14_3_3.handlers

class AddHandler: BaseHandler() {

    override fun handle(num1: Int, num2: Int, operation: Char): Int? {
        print("+ ")
        if (operation == '+'){
            return num1 + num2
        }
        return super.handle(num1, num2, operation)
    }

}