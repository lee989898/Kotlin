import java.io.*
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    val token = StringTokenizer(readLine())
    val A = Integer.parseInt(token.nextToken())
    val B = Integer.parseInt(token.nextToken())

    if(A > B){
        print(">")
    }else if(A < B){
        print("<")
    }else if(A == B){
        print("==")
    }
}