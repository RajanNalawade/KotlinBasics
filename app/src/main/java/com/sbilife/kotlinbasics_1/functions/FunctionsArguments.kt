import kotlin.math.pow

//block code or set of statements used perform perticular task or functionality
//syntax
/*fun functionName(para1: Any, para2: Any): ReturnType {
    block of statements...
    return result
}*/

fun main() {
    //named arguments
    println("total of ${6} and ${10} = ${addNumbers(num2 = 6, num1 = 10)}")

    println("square of ${30} = ${squareNumber(30)}")

    println("default arguments with parameter")
    printMessage(3);//arguments
    println("default arguments without parameter")
    printMessage();

    //save function in to variables
    var obj: (num1: Int) -> Int = ::squareNumber
    println("square of ${5} with function store in to variables ${obj(5)}")

    var mPower = ::power1
    println("${3.0}power of ${4.5} is ${mPower(3.0, 4.5)}")

}

//parameters
fun addNumbers(num1: Int, num2: Int): Int {
    return num1 + num2;
}

//fun overloading
fun addNumbers(num1: Double, num2: Double): Double {
    return num1 + num2;
}

//inline function
fun squareNumber(num1: Int) = num1 * num1

//default argumets
fun printMessage(count: Int = 5) {
    for (i in 1..count) {
        println("Hello $i")
    }
}

fun power1(a: Double, b: Double): Double {
    return a.pow(b)
}