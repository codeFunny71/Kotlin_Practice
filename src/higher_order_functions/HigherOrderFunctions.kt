package higher_order_functions

/**
 *  @author Marcus Absher
 *
 *  practice with repeat functions
 *  practice with Higher Order Functions
 */

fun main() {

    //
    val powerBallNum : (Int) -> Unit = {
        val rnds = (1 until 69).random()
        println("$rnds ")
    }

    val lastBallNum : (Int) -> Unit = {
        val rnds = (1 until 29).random()
        println("$rnds ")
    }

    repeat(5, powerBallNum)
    repeat(5, powerBallNum)
}
/**
 *
 *  program takes in an anonymous function
 *  and runs it x times
 *
 *  @param times int that says number of
 *  times [action] should be called
 *  @param action anonymous function taken as parameter
 */
inline fun repeat(times: Int, action: () -> Unit){
    for (i in 0..times){
        action()
    }
}
/**
 *
 *  program takes in an anonymous function
 *  and runs it x times
 *
 *  @param times int that says number of
 *  times [action] should be called
 *  @param action anonymous function taken as parameter
 *  @param
 */
inline fun repeat(times: Int, action: (Any) -> Unit, input: Any){
    for (i in 0..times){
        action(input)
    }
}

//fun addNums(num1: Int, num2: Int) : Unit{
//    num1 + num2
//}