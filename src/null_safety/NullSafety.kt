package null_safety

/**
 *  @author Marcus Absher
 *
 *  program that asks for personal info
 *  uses the elvis operator to provide
 *  null safety
 */

fun main() {

    println("Please enter your first name")
    val fname = readLine() ?: "Joe"//throw IllegalArgumentException("first name expected")
    println("Please enter your last name")
    val lname = readLine()?: "Smith"//throw IllegalArgumentException("last name expected")
    println("Please enter your phone number")
    val phone = readLine()?: "206-555-1212"//throw IllegalArgumentException("phone number expected")
    println("Please enter your zip code")
    val zip = readLine()?.toInt() ?: "99999"

    println("Name: $fname $lname ")
    println("Phone: $phone")
    println("Zip: $zip")
}