package anonymous_functions

/**
 *  @author Marcus Absher
 *
 *  practice making anonymous functions
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
    lastBallNum.invoke(1)


}