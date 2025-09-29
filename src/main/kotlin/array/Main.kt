package org.example.array

fun main() {
    val numbers = arrayOf(1,2,3,4,5);

    val scoredCourses: Array<String> = arrayOf("Kotlin", "Java");

    println(numbers.contentToString())
    // use a for loop to display the elements

    for(element in scoredCourses) {
        print(element+" ")
    }

    // Another way to use the for loop

    scoredCourses.forEach { element-> println(element) }

    // range

    // usage of range operator with step

    for(i in 1..10 step 2) {
        print(i)
    }
    println()
    for(i in 10 downTo 0 ) {
        print(i)
    }
    println()

    for((index, value) in scoredCourses.withIndex()) {
        println("$index : $value")
    }
    val scores:IntArray = intArrayOf(1,2,3,4,5);
    val marks: FloatArray = floatArrayOf(23.3f,23.3f,23.3f);
    val weather: DoubleArray = doubleArrayOf(23.31,23.31,23.31,23.31);

}