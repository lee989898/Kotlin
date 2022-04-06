import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){
    val x = nextInt()
    val y = nextInt()

    if(x > 0 && y > 0){
        print("1")
    }else if(x < 0 && y > 0){
        print("2")
    }else if(x < 0 && y < 0){
        print("3")
    }else if(x > 0 && y < 0){
        print("4")
    }
}