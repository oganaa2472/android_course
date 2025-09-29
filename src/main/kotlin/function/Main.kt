package org.example.function

fun add(number1: Int, number2: Int): Int{
    return number1 + number2;
}

fun addNumbers(number1:Int=10,number2:Int=0):Int{
    return number1 + number2;
}

// variable arguments

fun addAll(vararg numbers:Int):Int{
    var sum = 0
    for (number in numbers){
        sum+=number
    }
    return sum;
}
fun subtract(number1: Int, number2: Int) = number1 - number2;
fun displayMessage(message:String) = println(message)

fun  main() {
    println(add(1,3))
    println(addNumbers(1,3))
    println(addNumbers())
    println(addAll(10,2,3,4,5,5))
    println(subtract(10,20))
    println(displayMessage("Hello world"))

    // store function     fun(a:Int, b:Int) = a+b


}