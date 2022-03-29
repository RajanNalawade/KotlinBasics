fun main() {

    var var1:(a:Int, b: Int) -> Int  = ::sum

    //lamda functions are anonymous functions having no name
    //in lamda function last line is return type of that lamda function.
    //Every Lambda function in background creates a class and then create its instance dynamically

    var lamda1 = {a:Int, b:Int -> a+b} //single line lamda function.

    var multiLinelamda = {
        println("multi linne lamda function")
        val a = 3 + 4
        //"Return Text"
        5
    }
    println("single line lamda : ${lamda1(2,5)}")
    println("multi line lamda : ${multiLinelamda()}")

    //Single param lamda
    var singleParmLamda = {x:Int -> x * x}
    var lamda2: (Int)->Int = {x -> x*x}
    println("single param 1 lamda : ${singleParmLamda(4)}")
    println("single param 2 lamda : ${lamda2(3)}")

    var sayHi = {msg:String -> println("Hello $msg")}
    var sayhi2: (String)->Unit = {msg -> println("Hello 2 $msg")}
    sayHi("rajan")
    sayhi2("danger")

    //simplified lamdas of above exprression
    //Kotliln's vaible 'it' points to single parameter so above singleParmLamda() or lamda2() becomes
    var simplifiedLamdas: (Int) -> Int = {it*it}
    var simplifiedLamdas2: (Int) -> Int = {it*it}
    println("simplified 1 lamda : ${simplifiedLamdas(4)}")
    println("simplified 2 lamda : ${simplifiedLamdas2(3)}")


    //now calling Calculator function wuth lamda function
    //calculate(3,5, {s,f -> s*f})
    //now above function again simplified as follows
    //because if function type is your last parameter then Lambda argument should be moved out of parentheses
    println("output : ${calculate(3,5) { s, f -> s * f }}")


}

fun sum(a: Int, b:Int): Int = a+b

fun calculate(a: Int, b: Int, op:(Int,Int) -> Int): Int{
    return op(a, b)
}