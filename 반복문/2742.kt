import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {

    for (i in Integer.parseInt(readLine())downTo 1) {
        println(i)
    }
}