package java_conversions

/**
 *  @author Marcus Absher
 *
 *  program takes in a number and returns
 *  all prime numbers less than number
 */

fun main() {

    println("Enter a positive integer")

    val number = readLine()?.toInt()

    number?.let {
       val primes : Array<Boolean?> = calculate(number)
        (2..primes.size-1).forEach { i ->
            println("$i is ${ primes[i]}")
        }
    } ?: print("You entered nothing")
}

/**
 * Generates array od numbers from 2 until selected number
 * marking each index true if its a prime number
 * @param number int
 * @return the new size of the group.
 */
fun calculate(number: Int) : Array<Boolean?> {
    val primes = arrayOfNulls<Boolean?>(number + 1)
    for (item in primes.indices) {
        primes[item] = isPrime(item)
    }
    return primes
}

/**
 * returns true if prime
 * @param number accepts int and checks if its prime
 * @return boolean value
 */
fun isPrime(number: Int) : Boolean{
    var result = true

    if (number < 2) {result = false}

    for (i in 2 until number){
        if (number % i == 0){
            result = false
        }
    }
    return result
}

