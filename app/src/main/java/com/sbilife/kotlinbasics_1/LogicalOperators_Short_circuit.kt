fun main() {
    val above70 = false
    val knowsLang = false

    //&& AND
    val calledForInterview = above70 && knowsLang

    println("interview Cleared? : ${calledForInterview}")

    var i = 10
    var k = 11

    var result = i == 15 || k++ == 12
    println(i)
    println(k)
}