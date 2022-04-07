import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = br.readLine().toInt()
    val b = br.readLine().toInt()
    val c = br.readLine().toInt()
    var result = a*b*c
    val arr = Array(10){ 0 }

    while (result > 0){
        arr[result % 10]++
        result /= 10
    }

    arr.forEach{
        bw.write("$it\n")
    }
    bw.flush()
    bw.close()
}
