package com.example.kotlin

fun main() {
    val result = test(1, c = 5)
    println(result)
    test2(name = "상아님", "채상아", "상아")
    test3(1,3)
}

// 2. 함수
fun test(a: Int, b: Int = 3, c: Int = 4): Int {
    println(a + b)
    return a + b
}

fun test2(name: String, nickname: String, id: String) = println(name + nickname + id)

fun times(a: Int, b: Int,): Int {
    return a * b
}

fun test3(a: Int, b: Int) = a * b