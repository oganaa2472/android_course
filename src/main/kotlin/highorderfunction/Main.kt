package org.example.highorderfunction


fun add(a: Int, b: Int): Int = a + b

fun sub(a: Int, b: Int): Int = a - b

fun operation(number1:Int,number2:Int, myFun:(Int,Int)->Int): Int{
    return myFun(3,4);
}

fun main(){
    val x = ::add;
    operation(10,20,x) // pass add function as parameter to operation function

    println(operation(10,20,myFun=x))
    println(operation(10,20,::sub))

    println(operation(20,20,{number1,number2 -> number1*number2}))


    println(operation(20,20){number1,number2 -> number1*number2})

}