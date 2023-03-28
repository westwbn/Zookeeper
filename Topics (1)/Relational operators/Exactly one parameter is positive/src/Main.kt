fun main() {
    val numbers = mutableListOf<Int>()
    for (num in 1..3) {
        numbers.add(readln().toInt())
    }
    val positive = numbers.filter { it > 0 } // filter out positive numbers

    if (positive.size == 1) { // check if there is only one positive number
        println(true)
    } else {
        println(false)
    }
}
