package org.example.functionref

fun add(a: Int, b: Int) = a + b

fun main(){
    var result = ::add// is a function reference operator


    println(result(2,4))


    val sub = {num1: Int, num2: Int -> num1 + num2} // lambda expression

    println(sub(1,3))

}