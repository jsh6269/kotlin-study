package basic;

class Student(var name: String, var age: Int, var grade: Char) {
    fun addAge(inc: Int){
        age = age + inc
    }
    fun desc(){
        println("$name($age) got $grade")
    }
}

fun main(){
    val s = Student("Jang", 21, 'A')
    s.addAge(2)
    s.desc()
}
