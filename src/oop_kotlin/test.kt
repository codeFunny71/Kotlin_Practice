package oop_kotlin

fun main() {
    val member = GymMembership("Sarah", "Smithers", "premiere")

    member.printMembershipBadge()
    println()

    println(member.toString())
}