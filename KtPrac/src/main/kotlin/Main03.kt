/*
*   Grade Calculator: Write a program that converts numerical scores to letter grades (A: 90-100, B: 80-89, etc.) using when.
*/

fun main() {
    print("Enter your score: ")
    var score: Int?
    score = readLine()?.toIntOrNull()

    if (score == null || score !in 0..100) {
        do {
            print("Enter your score (score must be between 0 and 100 (0 and 100 included)): ")
            score = readLine()?.toIntOrNull()
        } while (score == null || score !in 0..100)

        var grade01 = when (score) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "F"
        }

        println("Your grade is: $grade01")
    } else {
        var grade = when (score) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "F"
        }
        println("Your grade is: $grade")
    }
}