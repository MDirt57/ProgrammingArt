package task6_3_1

fun main() {

    val filename = "test.txt"
    val content = "Singleton is..."

    FileProvider.createFile(filename)
    FileProvider.writeFile(filename, content)
    FileProvider.readFile(filename)

    FileProvider.writeFile(filename, content)
    FileProvider.readFile(filename)

}