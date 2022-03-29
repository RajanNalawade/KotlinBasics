fun main() {
    val isRaining = false

    val output = if (isRaining){
        "its Raining - take umbrella"
    }else{
        "NO Raining - njoy your day"
    }
    println(output)

    //Kotlin do not support turnery operator (condition ? "result1" : "result2")
    val number = 567
    val result = if( number%2 == 0) "Even" else "odd"
    println(result)

    //Ranges
    // .. includes upper bound
    // until not includeed upper bound
    var data = 40
    val result1 = data in 30..300
    println(result1)

    //when statement like switch case in java
    val animal = "Dog"
    val result2 = when (animal){
        "Horse" -> "animal is Horse"
        "Cat" -> "animal is CAT"
        "Dog" -> "animal is DOG"
        else -> "animal not found"
    }
    println(result2)

    val num = 34
    val result3 = when(num){
        10 -> "Ten"
        40 -> "Forty"
        in 30..40 -> "IN between 30 to 40"
        else -> "Number Not found"
    }
    println(result3)


    //vararg -> user can pass varible no. of arguments, varible becomes array
    addNums(1,3,4,6,5,32)
    addNums(5,6,5,6,5,6)
}

fun addNums(vararg values: Int){
    var sum = 0
    for (i in values){
        sum += i
    }
    println(sum)
}