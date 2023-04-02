package com.example.kotlin


fun main() {
    max(10, 3)
    isHoliday("금")
}

// java 는 조건식이 조건문으로(state)지만 , kotlin 은 식이다(expression)
fun max(a: Int, b: Int) {
    val result = if (a < b) a else b
    println(result)
}

// 월 화 수 목 금 토 일
fun isHoliday(dayOfWeek: String) {
    val result = when (dayOfWeek) {
        "토",
        "일" -> true
        else -> false
    }
    println(result)
}

fun isHolidays(dayOfWeek: Any) {
    when (val day = dayOfWeek) {
        "토",
        "일" -> if(day == "토") "좋아" else "너무 좋아"
        in 2..4 -> {}
        in listOf("월", "화") -> {}
        else -> "안좋아"
    }
}