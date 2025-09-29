package org.example.nullable

fun main(){
    var courseName = "MDP"
    courseName = "MPP"
    //courseName = null
    var car : String?= "Tesla" // the variable car is nullable //
    // it doesn't allow null able value
    car  = null
    car = "Toyota"
    println(car?.uppercase()) // safe call operator => ?.

    car = null

    println(car?.length?:0)//
    if(car!=null){
        println(car!!.length)
    }




}