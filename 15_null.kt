package basic;

class MyClass(val supreme: String, val chain: MyClass?)

// if instance variable is null, its property is regarded as null
fun manager(inst: MyClass): String? = inst.chain?.supreme

fun ignoreNull(str: String?) {
    // s cannot be null
    val s: String = str!!
    println(s.length)
}

fun main() {
    // cannot assign null
    var n1: Int = 1
    // n1 = null
    println(n1)

    // can assign null
    var n2: Int? = null
    println(n2)
    
    // elvis operator
    // 0 if n2 is null else n2
    var n3: Int = n2 ?: 0
    println(n3)
    
    val p1 = MyClass("Bob", null)
    val p2 = MyClass("Alice", p1)
    println(manager(p1))
    println(manager(p2))

    // null pointer exception occurs
    // ignoreNull(null)
    
    ignoreNull("Hello")
    
    // isNullOrEmpty determines whether the string is null or not
    val s: String? = null
    println(s.isNullOrEmpty())
    println("Hello".isNullOrEmpty())
}