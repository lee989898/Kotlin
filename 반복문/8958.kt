import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val size = br.readLine().toInt()
    val arr = mutableListOf<String>()
    var num = 1
    var sum = IntArray(size) { 0 }

    for (i in 0 until size) {

        val token = StringTokenizer(br.readLine())
        arr.add(token.nextToken().toString())
    }

    for (i in 0 until size) {
        for(j in 0 until arr[i].length){
            if(arr[i][j].toString() == "O"){
                sum[i] += num++
            }else{
                num = 1
            }
        }
        num = 1
        println(sum[i])
    }
}