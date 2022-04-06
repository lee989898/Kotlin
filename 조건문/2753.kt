import java.io.*
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val token = StringTokenizer(readLine())
    val year = Integer.parseInt(token.nextToken())

    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        print("1")
    }else{
        print("0")
    }
}