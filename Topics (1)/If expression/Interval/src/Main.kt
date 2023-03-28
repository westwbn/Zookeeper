fun main() {
    val number = readln().toInt()

    print(if (-15 < number && number <= 12 || number in 15..16 || number >= 19) "True" else "False")
}