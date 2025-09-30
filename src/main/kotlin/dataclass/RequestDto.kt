package org.example.dataclass

data class RequestDto(
    val name: String,
    val age: Int,
)

fun main(){
    val request = RequestDto(name = "Hello",age = 25)

    println(request)

    println(request.name)
    println(request.age)

    val request2 = request.copy(name = "John",age = 25)

    println(request2==request)
    println(request2.equals(request))

    println(request2===request)
}
