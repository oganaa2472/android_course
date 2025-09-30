package org.example.enumdemo


enum class Coffee {

    AMERCICANO,LATTE,CAPPUCINO
}

fun main(){

    println(Coffee.CAPPUCINO.name)

    println(Coffee.values().joinToString { it.name })

    println(Coffee.valueOf(readlnOrNull()?:"CAPPUCINO"))

    val coffee: Coffee = Coffee.LATTE
//    when(coffee){
//        Coffee.CAPPUCINO -> {
//            println("Americano")
//        }
//    }
}