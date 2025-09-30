package org.example.interfacedemo

interface Circle {

    val pi: Double
        get() = 3.14
    val radius : Double/// abstract property
    fun getArea() : Double = pi * radius
// abstract
    fun drawCircle()  // abstract property
}

class CircleImpl: Circle{
    override val radius: Double
        get() = TODO("Not yet implemented")
    override val pi = 4.5
    override fun drawCircle() {
        TODO("Not yet implemented")
    }

}