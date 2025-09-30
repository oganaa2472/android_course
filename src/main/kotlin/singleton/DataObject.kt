package org.example.singleton

object DataObject {

    fun getConnection(){
        println("Connection which is connected")
    }

}
fun main(){
    DataObject.getConnection()
}