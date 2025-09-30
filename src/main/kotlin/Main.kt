package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "World"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello $name!")
    var course:String = "Kotlin Fundamentals"
    println(course)

    var number = 19
    number--
    println(number)

    println("this is number $number")
    println("this is number $course")
    println("this is number ${course.uppercase()}")

    // immutatable list
    val names = listOf("John", "Denise", "Jan")

    // mutable list
    val scoredCourses = mutableListOf("Kotlin","Java","Python","Python")

    scoredCourses.add("Swift")
    println(scoredCourses)


    // kotlin loops


}