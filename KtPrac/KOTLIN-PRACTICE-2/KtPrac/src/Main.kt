/*
Number Classifier: Write a function that classifies a number as positive, negative, or zero.
* */

//Modify the code to ensure that the user enters a numeric value.

fun collectInput(numString: String?): String? {
    var numStringToDouble = numString?.toDoubleOrNull()
    if (numStringToDouble == null) {
        return "Invalid input"
    } else {
        if (numStringToDouble < 0.0) {
            return "$numStringToDouble is negative"
        } else if (numStringToDouble > 0.0) {
            return "$numStringToDouble is positive"
        } else {
            return "$numStringToDouble is 0.0"
        }
    }
}

fun hasAlphabet(input: String?): Boolean {
    if (input != null) {
        val regex = Regex("[a-zA-Z]")
        return regex.containsMatchIn(input)
    }
    return false
}

fun main() {
    var userInput: String?
    do {
        print("Enter a number: ")
        userInput = readLine()
    } while (hasAlphabet(userInput) == false)
    println(collectInput(userInput))
}