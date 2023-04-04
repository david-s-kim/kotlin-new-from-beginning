package chapter2

fun main() {
    // 확장함수 Extension function
    // 기존에 정의되어 있는 클래스에 함수를 추가하는 기능

    val test = Test()
    Test().hello()
    test.hi()
}

// Test라는 클래스에 hi라는 함수를 추가한것과 동일한 기능
fun Test.hi() = println("하이")

class Test(){
    fun hello() = println("안녕")
    fun bye() = println("잘가")
}