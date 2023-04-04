package com.example.kotlin

// Null
fun main() {
    var name: String = "david"
    var number: Int = 10


    // ? 붙이면 null 가능
    var nickname: String? = null
    var secondNumber: Int? = null

//    val result = if(nickname == null) {
//        "값이 없음"
//    } else {
//        nickname
//    }
//    println(result)

    // 엘비스오퍼레이터
    nickname = null
    val result = nickname?: "값이 없음"

    println(result)

    // nickname이 null이 아니면 length 값을 가져옴
    val size = nickname?.length

}