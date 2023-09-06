package basic;

fun main() {
    var sum = 0
    for(i: Int in 1..100)
        sum += i
    println(sum)

    sum = 0
    for(i in 1 until 101)
        sum += i
    println(sum)

    var i = 0
    sum = 0
    while(i <= 100){
        sum += i
        i++
    }
    println(sum)

    i = 0
    sum = 0
    while(true){
        if(i > 100)
            break
        sum += i
        i++
    }
    println(sum)

}