import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Scanner
import java.util.StringTokenizer

var C : Int = 0

fun main(args: Array<String>) {
    val scr = Scanner(System.`in`)

    C = scr.nextInt()

    val results = StringBuffer()
    for(i in 0 until C){
        val N = scr.nextInt()
        val scores = mutableListOf<Int>()
        var total = 0
        for(j in 0 until N){
            val score = scr.nextInt()
            total += score
            scores.add(score)
        }
        val avg = total/N
        var count = 0
        for(j in 0 until N){
            if(scores[j] > avg)
                count++
        }
        val result = String.format("%.3f", count.toDouble()/N*100)
        results.append("$result%\n")
    }
    print(results.toString())
}