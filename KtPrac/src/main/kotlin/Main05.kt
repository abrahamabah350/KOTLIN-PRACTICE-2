/*
Countdown Timer: Create a countdown that starts from 10 and counts down to 1.
*/

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000L) //Delay for 1 second
        println("Executed after 1 second")
    }
}