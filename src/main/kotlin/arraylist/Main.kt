package org.example.arraylist



fun main() {
    // create  a mutable list
    val names = arrayListOf("Kotlin", "Java", "Java", "Kotlin");
    println(names)
    names.clear()
    println(names.firstOrNull())
    println(names.lastOrNull())
}