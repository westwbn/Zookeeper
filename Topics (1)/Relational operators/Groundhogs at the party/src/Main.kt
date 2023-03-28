fun main() {
    val cup = readln().toInt()
    val weekend = readln().toBoolean()

    println(cup in 15..25 && weekend || cup in 10..20 && !weekend)
}