package com.example.kotlin

fun main() {
    val user = User("david", 10)
    println(user.age)
    Kid("아이", 3, "male")
    println()
}

open class User(open val name: String, open val age: Int = 100)

class Kid(override val name: String, override var age: Int) : User(name, age) {
    var gender: String = "female"

    // 클래스 안에서 가장먼저 호출되는 부분
    init {
        println("초기화 중입니다.")
    }

    constructor(name: String, age: Int, gender: String) : this(name, age) {
        this.gender = gender
        println("부생성자 호출")
    }
}

