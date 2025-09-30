package org.example.simpleinheritance

open class Person(var name: String)

class Student(name: String, grade: Int = 0) : Person(name)


fun main() {
    val student = Student("John",grade=5)
    println(student.name)
}