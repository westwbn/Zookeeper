fun main() {
    val n = readln().toInt()
    val grades = mutableMapOf("A" to 0, "B" to 0, "C" to 0, "D" to 0)

    repeat(n) {
        when (readln().toInt()) {
            5 -> grades["A"] = grades["A"]!! + 1
            4 -> grades["B"] = grades["B"]!! + 1
            3 -> grades["C"] = grades["C"]!! + 1
            2 -> grades["D"] = grades["D"]!! + 1
        }
    }
    print("${grades["D"]} ${grades["C"]} ${grades["B"]} ${grades["A"]}")
}