package task6_3_1

import java.io.File

object FileProvider {

    fun createFile(name: String){
        val file = File(name)
        file.createNewFile()
    }

    fun writeFile(name: String, text: String){
        val file = File(name)
        file.appendText(text)
    }

    fun readFile(name: String){
        val file = File(name)
        println(file.readLines())
    }
}