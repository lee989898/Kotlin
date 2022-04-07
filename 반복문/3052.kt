import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val arr = Array(42){ 0 }
    var zero = 0

    repeat(10){
        val a = br.readLine().toInt()
        arr[a % 42]++
    }

    for(i in 0..41){
        if(arr[i] != 0) {
            zero++
        }
    }

    print(zero)

    bw.flush()
    bw.close()
}