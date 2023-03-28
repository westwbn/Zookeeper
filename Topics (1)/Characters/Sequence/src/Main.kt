fun main() {
    val letters = mutableListOf<Char>()
    val num = 3

    repeat(num) {
        letters.add(readln().first())
    }
    println(letters[0] + 1 == letters[1] && letters[0] + 2 == letters[2])
}