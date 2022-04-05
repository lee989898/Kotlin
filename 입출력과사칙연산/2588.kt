import java.util.Scanner

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)
    val A = sc.nextInt()
    val B = sc.nextInt()

    println(A*(B%10))
    println(A*(B/10%10))
    println(A*(B/100%10))
    println(A*B)
}