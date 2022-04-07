import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {

    val maxArray = arrayListOf<Int>()

    for (i in 0 until 9) {
        val inputNum = readLine().toInt()
        maxArray.add(inputNum)
    }

    val maxNum = Collections.max(maxArray)
    val maxLine = maxArray.indexOf(maxNum)

    println("$maxNum\n${maxLine + 1}")
}
  