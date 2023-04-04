package com.example.kotlin


fun main() {
    println(check("안녕"))
    println(check(3))
    println(check(true))
    cast("안녕")
    cast(10)

    smartCast("하이")


}

// kotlin에서는 type checking을 할때 is를 사용한다
fun check(a: Any): String {
    return when (a) {
        is String -> {
            "문자열"
        }
        is Int -> {
            "숫자"
        }
        else -> {
            "몰라요"
        }
    }
}

fun cast(a: Any) {
    val result = a as? String
    println(result)
}

fun smartCast(a: Any) {
    if (a is String) {
        a.length
    } else if(a is Int) {
        a.dec()
    }

}