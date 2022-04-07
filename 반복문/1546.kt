import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val size = br.readLine().toInt()
    val arr = DoubleArray(size){ 0.0 }
    var sum = 0.0

    val token = StringTokenizer(br.readLine(), " ")

    for(i in 0 until size){
        arr[i] = token.nextToken().toDouble()
    }

    val max = arr.maxOrNull()

    for(i in 0 until size){

        arr[i] = ((arr[i] / max!!) *100)
        sum += arr[i]
    }
    print("${sum/size}")
}