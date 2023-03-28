fun main() {
    val healthyHours = readln().toInt()
    val limitHours = readln().toInt()
    val hoursPerDay = readln().toInt()

    when {
        hoursPerDay in healthyHours..limitHours -> println("Normal")
        healthyHours in hoursPerDay + 1..limitHours -> println("Deficiency")
        else -> println("Excess")
    }
}