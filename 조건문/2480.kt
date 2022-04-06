import java.util.*
import kotlin.math.max

fun main() = with(Scanner(System.`in`)) {
    var (one, two, three) = Triple(nextInt(), nextInt(), nextInt())
    var money = 0

    if(one == two && two == three){
        money = 10000 + (one * 1000)
    }else if(one == two){
        money = 1000 + (one * 100)
    }else if(two == three){
        money = 1000 + (two * 100)
    }else if(one == three){
        money = 1000 + (three * 100)
    }else{
        var max = max(one, two)
        max = max(max, three)
        money = max*100
    }
    print(money)
}