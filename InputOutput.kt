/* sum(A,B) stdin
fun main(args: Array<String>) {
    val str = readLine()
    if(str != null) {
        val ab = str.split(" ")
        println(ab[0].toLong() + ab[1].toLong())
    }
}
*/

//sum(A, B) fin
import java.io.File

fun main(args: Array<String>) {
    val writer = File("output.txt").bufferedWriter()
    val line = File("input.txt").readLines()[0].split(Regex(" "))
    writer.write((line[0].toInt() + line[1].toInt()).toString())
    writer.close()
}
