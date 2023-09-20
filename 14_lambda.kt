package basic;

fun apply(a: Int, b: Int, f:(Int, Int) -> Int){
    println(f(a, b))
}

fun getDivider(): (Double, Double) -> Double {
    return {i, j -> i / j}
}

fun main() {
    val adder = {a: Int, b: Int -> a + b}
    println(adder(3, 5))
    apply(3, 5, adder)
    apply(3, 5, {i: Int, j: Int -> i * j})
    apply(3, 5) {i, j -> i * j}
    println(getDivider()(6.0, 4.0))
}