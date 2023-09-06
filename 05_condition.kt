package basic;

fun main() {
    val score: Int = 80
    if(score >= 90)
        println("A+")
    else if(score >= 70)
        println("B")
    else
        println("F")
    
    val pf = if(score > 85) "pass" else "fail"
    println(pf)
    
    when(score/10){
        9, 10 -> println("A+")
        7, 8 -> println("B")
        else -> println("F")
    }
}