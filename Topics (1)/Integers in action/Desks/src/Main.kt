fun main() {
    var result = 0
    for (num in 1..3){
        val number = readln().toInt()
        val group = number / 2 + number % 2
        result += group
    }
    println(result)
}