package org.example.staticdemo



class Stack {

    companion object {
        val stack = mutableListOf<Int>()
        fun push(item:Int){
            stack.add(item)
        }
        fun pop():Int?{
            return if(stack.isEmpty()) null else stack.removeAt(stack.size - 1);
        }
    }
}

fun main(){
    Stack.Companion.push(1)

    Stack.push(2)
    println(Stack.stack)
}