package chapter2

// 초기화 지연
// 반드시 초기화를 하거나 타입을 지정해 줘야함
lateinit var text: String

// lazy 는 선언할때 초기화가 되어 있어야 함
val test: Int by lazy {
    println("초기화중")
    100
}

fun main() {
    // lateinit은 초기화를 나중에 해줌
    text = "name"

    println(text)

    println("메인 함수 실행")
    println("초기화 한 값 $test")
    println("두번째 호출 $test")


}