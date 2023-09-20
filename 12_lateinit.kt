package basic;

class Example {
    fun greet(): String = "Hello"
}

class MyClass {
    private lateinit var item: Example
    
    fun setUp() {
        item = Example()
    }
    
    fun showItem() {
        println(item.greet())
    }
}

fun main() {
    val x = MyClass()
    x.setUp()
    x.showItem()
}