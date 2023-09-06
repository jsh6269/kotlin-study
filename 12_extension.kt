package basic;

// 확장함수: 이미 선언된 객체나 클래스의 하위 함수를 생성, 재정의할 수 있음
fun String.greeting() {
    println("Hello, $this")
}

class Student(var name: String, var age: Int, var grade: Char) {
    // infix 함수: 기본값이 없는 매개변수가 오직 1개인 확장함수 혹은 클래스함수만 가능
    infix fun addAge(inc: Int){
        age = age + inc
    }
    fun desc(){
        println("$name($age) got $grade")
    }
}

fun main() {
    "Jang".greeting()
    // let: scope function
    Student("Jang", 21, 'A').let {
        // infix 함수는 . () 생략가능
        it addAge 5
        it.desc()
    }
}