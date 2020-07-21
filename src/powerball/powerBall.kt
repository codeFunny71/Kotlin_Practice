package powerball

/**
 *  @author Marcus Absher
 *
 *  program select 5 random numbers 1-69
 *  then selects 1 random number 1-29
 *
 */

fun main() {
    val powerBall : () -> Unit = {
        val powerBallNum : (Int) -> Unit = {
            val rnds = (1 until 69).random()
            print("$rnds, ")
        }

        val lastBallNum : (Int) -> Unit = {
            val rnds = (1 until 29).random()
            print("$rnds ")
        }

        repeat(5, powerBallNum)
        lastBallNum.invoke(1)
    }

    powerBall.invoke()
}

