/*
Day of Week: Create a program that takes a number (1-7) and returns the corresponding day of the week using a when expression.
*/

/*
    The when expression should check a number. Prompt the user to enter a number. Make sure that the user enters a number and only a number
*/

fun checkInput(): Int? {
    var userInput: String?
    fun hasAlphabet(input: String?): Boolean {
        if (input != null) {
            val regex = Regex("[a-zA-Z]")
            return regex.containsMatchIn(input)
        }
        return false
    }

    do {
        print("Enter a number (greater than 0 and less than 8): ")
        userInput = readLine()
    } while (hasAlphabet(userInput) == true)

    if (userInput?.toIntOrNull() != null) {
        return userInput?.toIntOrNull()
    }
    return 0
}

fun main() {
    var userInputToInt: Int?
    var dayRange = arrayOf(1, 2, 3, 4, 5, 6, 7)
    var message: String
    do {
        userInputToInt = checkInput()
    } while (userInputToInt !in dayRange)
    when (userInputToInt) {
        1 -> {
            message = "Sunday"
            println(message)
        }
        2 -> {
            message = "Monday"
            println(message)
        }
        3 -> {
            message = "Teusday"
            println(message)
        }
        4 -> {
            message = "Wednesday"
            println(message)
        }
        5 -> {
            message = "Thursday"
            println(message)
        }
        6 -> {
            message = "Friday"
            println(message)
        }
        7 -> {
            message = "Saturday"
            println(message)
        }
        else -> ""
    }
}