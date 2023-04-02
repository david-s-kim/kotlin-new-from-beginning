package com.example.kotlin

fun main() {

    1..10 == IntRange(1, 10)
    for (i in 1..10) {
        println(i)
        println(".")
    }
    for (i in 1 until 10) {

    }
    for (i in 1..10 step (2)) {
        println(i)

    }
    for (i in 1 downTo 10 step (2)) {
        println(i)
        println(".")
    }

    var c = 1
    while (c < 10) {
        println(c)
        c++
    }
}