package basic;

fun main() {
    var str = "Hello, World!"
    println(str[0])
    println(str[str.length-1])
    
    println(str.uppercase())
    println(str.lowercase())
    
    // 0 if the same
    println(str.compareTo("Hello, World!"))

    // 5
    println(str.indexOf(", W"))
    println("Hello," + " " + "World!")
    
    var a = 3
    var b = 5
    println("$a apples and $b oranges")
    
    println("3".toInt() + 5)
}