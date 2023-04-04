package chapter2

// data, sealed class

fun main() {
    val person = Person("수지", 21)
    val dog = Dog("해피", 24)

    println(person.toString())
    println(dog.toString())
    println(dog.copy(age = 3).toString())

    val cat: Cat = BlueCat()
    val result = when(cat) {
        is BlueCat -> {"blue"}
        is RedCat -> {"red"}
        is GreenCat -> {"green"}

        else -> {"none"}
    }
    println(result)

}
class Person(
    val name:String,
    val age: Int,
)

// data class 는 반드시 하나이상의 프로퍼티가 필요하다
data class Dog(
    val name: String,
    val age: Int,
)

// sealed class -> 추상클래스
// else 를 쓰지 않아도 되는 장점
// 상속받은 자식 클래스의 종류를 제한
sealed class Cat
class BlueCat: Cat()
class RedCat: Cat()
class GreenCat: Cat()
class WhiteCat: Cat()