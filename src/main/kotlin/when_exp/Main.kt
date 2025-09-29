package org.example.when_exp

import java.time.DayOfWeek

fun main() { //
// var,val


    val dayOfWeek = 3;
    when(dayOfWeek) {
        1 ->println("Monday")
        2 ->println("Tuesday")
        3 ->println("Wednesday")
        4 ->println("Thursday")
        5 ->println("Friday")
        6 ->println("Saturday")
        7 ->println("Sunday")
        else ->println("Unknown day of week $dayOfWeek")
    }



    // another way of using expression
    // var,val which is like
}