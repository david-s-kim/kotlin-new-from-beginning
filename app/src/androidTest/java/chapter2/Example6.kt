package chapter2

// object
// 클래스를 정의함과 동시에 객체를 생성
// - 싱글톤을 쉽게 만들 수 있는 키워드
// - 생성자 사용 불가
// - 프로퍼티, 메서드, 초기화 블록은 사용 가능
// - 다른 클래스나, 인터페이스를 상속받을 수 있음

fun main() {

    println(Counter.count)
    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    // 상속받은 함수 사용가능
    Counter.hello()

    Book.name

}

object Counter: Hello() {
    // 초기화 블럭
    init {
        println("카운터 초기화")
    }
    // 포로퍼티 생성가능
    var count = 0
    // 메서드 생성가능
    fun countUp(){
        count++
    }
}

open class Hello(){
    fun hello() = println("hello")
}

// companion object
// java의 static 과 동일한 역할
// 클래스 내에 하나만 생성할 수 있음

class Book {
    companion object {
        const val name = "hello"
        fun create() = Book()

    }
}