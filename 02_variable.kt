package basic;

fun main() {
    var a: Int = 1
    var b = 3
    
/*
    // works fine
    var b: int
    b = 3
    
    // error
    // cannot postpone assignment unless its type is specified
    var b
    b = 3
*/

    var c: String = "Hello"
    var d = "Jang"
    
    // val cannot be modified
    val PI: Double = 3.141592

    println(a)
    println(b)
    println(c)
    println(d)
    println(PI)

    // (type)? makes it possible to assign null
    var n1: Int? = null
    println(n1)

}