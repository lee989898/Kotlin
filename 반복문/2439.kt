import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {

    val n = readLine().toInt()

    for (i in 1..n) {
        for(j in n downTo  1){
            if(i >= j) print("*")
            else print(" ")
        }
        println()
    }
}