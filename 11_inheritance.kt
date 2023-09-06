package basic;

// open을 명시해야 상속, 오버라이딩 가능
open class Man(var name: String, var age: Int){
    open fun desc(){
        println("$name($age)")
    }
}

class Student: Man {
    var grade: Char
    constructor(name: String, age: Int, grade: Char): super(name, age){
        this.grade = grade
    }
    fun addAge(inc: Int){
        age = age + inc
    }
    override fun desc(){
        println("$name($age) got $grade")
    }
}

fun main(){
    val s = Student("Jang", 21, 'A')
    s.addAge(2)
    s.desc()
    
    val m = Man("Goethe", 83)
    m.desc()
    
    // 부모클래스 참조변수에서 호출해도 자식클래스에서 오버라이딩한 메소드가 호출됨
    // Jang(23) got A
    val ss: Man = s
    ss.desc()
}

