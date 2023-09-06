package basic;

fun adder(a: Int, b: Int): Int{
    return a + b
}

fun add(x: Int, y: Int) = x + y

fun main() {
    var x = adder(3, 5)
    println(x)

    x = add(5, 8)
    println(x)
    
}