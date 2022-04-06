import java.io.*
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val token = StringTokenizer(readLine())
    val dan = Integer.parseInt(token.nextToken())


        for(i in 1..9){
            println("$dan * $i = ${dan*i}")
        }

}