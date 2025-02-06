package task4_3_2

class Line {

    class Builder{

        private var line: String = ""

        fun setText(text: String): Builder{
            line = text
            return this
        }

        fun insertText(text: String, index: Int): Builder{
            if (line.length-1 > index){
                line = line.slice(0..index) + text + line.slice(index+1..<line.length)
            }
            return this
        }

        fun addText(text: String): Builder{
            line += text
            return this
        }

        fun build(): Line{
            return Line(line)
        }

    }

    private var line: String

    private constructor(text: String){
        line = text
    }

    fun getText(): String{
        return line
    }

    override fun toString(): String {
        return "This line is $line"
    }

}