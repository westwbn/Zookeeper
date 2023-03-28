fun main() {
    val letters = mutableListOf<Char>().apply {
        repeat(4) {
            add(readln().first())
        }
    }

    repeat(4) { index ->
        letters[index]--
        println(letters[index])
    }
}