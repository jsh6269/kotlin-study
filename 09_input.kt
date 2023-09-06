package basic;

import java.util.*

fun main() {
    println("Enter your name")
    // read one line
    var name: String? = readLine()
    println("Hello, $name")
    
    val scanner = Scanner(System.`in`)
    print("Name: ")
    name = scanner.nextLine()
    print("Age: ")
    val age: Int = scanner.nextInt()
    println("$name is $age years old")
    
}