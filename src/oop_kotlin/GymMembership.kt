package oop_kotlin

class GymMembership(private val fName: String, val lName: String, val accountType: String) {

    val type = arrayOf("premiere","standard","limited")

    init {
        require(type.contains(accountType))
    }

    fun printMembershipBadge(){
        println()
        println("Sweat City Gym")
        println("Account Name: $fName $lName")
        println("Account Type: $accountType")
        println()
    }

    override fun toString(): String {
        return "Membership for $fName $lName"
    }

}