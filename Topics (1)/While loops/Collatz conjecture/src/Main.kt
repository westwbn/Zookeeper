@SuppressWarnings("MagicNumber")

fun main() {
    var number = readln().toInt()

    while (number != 1) {
        print("$number ")
        if (number % 2 == 0) {
            number /= 2
        } else {
            number = number * 3 + 1
        }
    }
    println(1)
}