import java.io.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val ori = br.readLine().toInt()
    var num = ori
    var sum: Int
    var cnt = 0

    do {
        sum = num/10 + num%10
        num = num%10*10 + sum%10
        cnt++
    } while (ori != num)

    println(cnt)
    br.close()

}