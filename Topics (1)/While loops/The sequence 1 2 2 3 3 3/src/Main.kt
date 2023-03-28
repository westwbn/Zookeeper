fun main() {
    val n = readln().toInt()
    val number = mutableListOf<Int>()
    var i = 1

    while (i <= n) {
        repeat(i) {
            if (number.size < n) {
                number.add(i)
            }
        }
        i++
    }

    for (num in number) {
        print("$num ")
    }
}