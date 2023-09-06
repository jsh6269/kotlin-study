package basic;

fun main() {
    val nums = arrayOf(1, 3, 5, 4, 2)
    val names: Array<String> = arrayOf("jang", "Goethe", "Plato")
    
    println(nums.size)
    if("Goethe" in names){
        println("Faust!")
    }
    
    for(x in nums){
        print("$x ")
    }
    println()
    
    nums[2] = 99
    
    for(x in nums){
        print("$x ")
    }
    println()
    
}