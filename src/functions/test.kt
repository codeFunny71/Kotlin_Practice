package functions

fun main() {

    val member = Functions()

    member.printMessage("Hello")                                               // 5
    member.printMessageWithPrefix("Hello", "Log")                              // 6
    member.printMessageWithPrefix("Hello")                                     // 7
    member.printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
    println(member.sum(1, 2))                                                  // 9
}