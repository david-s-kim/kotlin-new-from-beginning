package chapter2

fun main() {
    // 람다
    // 1. 익명함수
    // 2. 변수처럼 사용돼서, 함수의 argument, return이 될 수 있다
    // 3. 한번 사용되고 재사용되지 않는 함수
    val a = fun() { println("hello") }

    // 마지막줄이 리턴값
    val b: (Int) -> Unit = {
        it * 10
        println(it)
    }
    println(b(10))

    val d = { i: Int, j: Int -> i * j }

    val f: (Int, String, Boolean) -> String = {
        _, b, _ -> b
    }

    hello(10, b)
}
fun hello(a: Int, b: (Int) -> Unit) {
    println(a)
    println(b(20))
}