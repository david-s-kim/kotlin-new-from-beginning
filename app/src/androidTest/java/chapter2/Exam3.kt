package chapter2

// Scope function

fun main() {
    //let, run, apply, also, with
    // 1. let
    // 수신객체.let { it -> // it 생략불가
    //
    // 마지막줄 // return
    // }

    val a = 3
    a.let { }
    val user = User("david", 20, true)

    val age = user.let {
        user.age
    }
    println(age)

    // 2. run
    // 수신객체.run { this -> // this 생략가능
    //
    // 마지막줄
    // }
    val kid = User("아이", 4, false)
    val kidAge = kid.run {
        // 그냥 접근이 가능함
        this.age
    }
    println(kidAge)

    // 3. apply
    // 수신객체.apply { this ->
    //
    // }
    // return 값이 수신객체
    val female = User("david", 20, true, true)
    val femaleValue = female.apply {
        // 값을 변경함
        hasGlasses = false
    }
    println(femaleValue.hasGlasses)

    // 4. also
    // 수신객체.also { it -> // local variable
    //
    //
    // } // return 수신객체 (자기자신)

    val male = User("민수", 17, false, true)
    val maleValue = male.also {
        it.name
        user.hasGlasses = false
    }
    println(maleValue)

    // 5. with
    // with(수신객체 { this - > // 생략가능
    // ---
    // 마지막줄(return)
    // }
    val result = with(male){
        hasGlasses = false
        true
    }


}

class User(
    val name: String,
    val age: Int,
    val gender: Boolean, // true: male, false: female
    var hasGlasses: Boolean = true
)

