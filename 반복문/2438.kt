import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {

    for (i in 1..Integer.parseInt(readLine())) {
        for(j in 1 .. i){
            print("*")
        }
        println()
    }
}