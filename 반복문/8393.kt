import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var sum = 0

    for (i in 1..nextInt()) {
        sum += i
    }

    print(sum)
}