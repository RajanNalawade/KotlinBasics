import kotlin.math.pow

fun main() {
    //functions can be stored in the varible by using (:: operator)
    //in kotlin functions are also called as 'first class citizen' means functions treated as objects

    //HIgher Order Functions
    //functions that accepts functions as argument or return functions or both

    println("sum = ${sum(3.0, 5.0)}")
    println("power = ${power(2.0, 3.0)}")

    var fn: (a: Double, b: Double) -> Double = ::sum
    println("function referenced in the varible = ${fn(3.5,6.5)}")

    //high order function calling
    //calculate(4.6,6.8, fn)
    calculate(4.6,6.8, :: sum)

    //Lamda function -> function having no name

}

//High order functions
fun calculate(a:Double, b:Double, gn: (a:Double, b:Double)-> Double){
    val result = gn(a, b)
    println("result $result")
}


fun sum(a:Double, b:Double): Double{
    return a+b
}

fun power(a:Double, b:Double): Double{
    return a.pow(b)
}

