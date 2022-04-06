import java.io.*
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val token = StringTokenizer(readLine())
    val score = Integer.parseInt(token.nextToken())

    if(score > 89){
        print("A")
    }else if(score > 79){
        print("B")
    }else if(score > 69){
        print("C")
    }else if(score > 59){
        print("D")
    }else{
        print("F")
    }
}