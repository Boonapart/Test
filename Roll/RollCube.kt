package Roll

import kotlin.random.Random
var rollCube: Int = roll()
fun roll(): Int {
    println("Ви кидає гральний кубик")
    var number = Random.nextInt(0, 20)
    println("Вам випало число $number")
    return number
}