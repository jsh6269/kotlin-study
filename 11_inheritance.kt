package basic;

// "open" : supports inheritance or overriding
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
    
    // overrided method(Student.desc) is called eventhough 'ss' is parent class type(Man)
    // Jang(23) got A
    val ss: Man = s
    ss.desc()
}

