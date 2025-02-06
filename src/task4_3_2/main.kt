package task4_3_2


fun main(){

    val line1 = Line.Builder()
        .setText("something")
        .build()

    val line2 = Line.Builder()
        .setText(line1.getText())
        .insertText("body got that ", 3)
        .addText("!")
        .build()

    println(line1)
    println(line2)

}