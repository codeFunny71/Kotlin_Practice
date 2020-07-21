package intermediate_practice
 //practice
fun main() {

    val array = arrayOf("a", "dog", "jumped", "over", "the", "fence")

    array.forEach { print(it) }

    val list = array.filter { it.isNotEmpty() }

    list.forEach { print("$it, ") }

     //*** practice with maps  ****
     //create an immutable map
     val mapOfColors = mapOf(
         "red" to 1,
         "blue" to 2,
         "yellow" to 3
     )

     //loop over my key/value pairs
     for (key in mapOfColors.keys)
     {
         //print out the color and ranking
         println("Color $key is ranked ${mapOfColors[key]}" )
     }

}