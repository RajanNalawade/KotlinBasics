fun main() {
    //Extention functions can add properties and methods to Classes
    //Extention functions can not access private members from that classes

    println("Hello Rajan".formattedString())

    //Every Lambda function in background creates a class and then create its instance dynamically
    // it raises performance issues
    //inline keyword increases performance of your code by not creating extra instances

    calculateFunctionRunningTime {
        loop(1000000)
    }

    calculateFunctionRunningTime {
        loop(1000000)
    }
    calculateFunctionRunningTime {
        loop(1000000)
    }
}

//Extention function to Class String

fun String.formattedString(): String{
    //this points to current object
    return "------------------------------\n$this\n-----------------------------------"
}

inline fun calculateFunctionRunningTime(fn: ()->Unit){
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis();
    println("Time taken to run this function is ${end - start} ms")
}

fun loop(num:Int){
    for(i in 1..num){

    }
}