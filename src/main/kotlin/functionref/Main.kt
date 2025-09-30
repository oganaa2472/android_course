package org.example.functionref

fun add(a: Int, b: Int) = a + b

fun main(){
    var result = ::add// is a function reference operator


    println(result(2,4))


    val sub = {num1: Int, num2: Int -> num1 + num2} // lambda expression

    println(sub(1,3))

    val subtractNumbers: (Int,Int)-> Int = {firstNumber,secondNumber ->
        // return firstNumber=secondNumber
        if(firstNumber>secondNumber) {
            firstNumber - secondNumber
        }
        else {
            secondNumber - firstNumber
        }
    }

    println(subtractNumbers(1,3))

    val square: (Int) -> Int = {data->
        data*data
    }
    val sq: (Int) -> Int = {it*it};
    println(square(1))
}