fun main() {

    //while loop
    var count = 56
    var index = 1
    while (index <= 10){
        println(count * index)
        index++
    }
    println("Outside loop ${index}")

    //do while loop
    do {
        println("gello")
    }while (count <= 55)

    //for loop with step (default step value is 1)
    for (i in 1..10 step 3){
        println("for loop eteration : ${i}")
    }

    println("-------------------until --------------------")
    //for loop with until which not includes upperbound
    for (i in 1 until 10 step 2){
        println("for loop eteration : ${i}")
    }

    println("-------------------downTo --------------------")

    for (i in 10 downTo -10 step 3){
        println("for loop eteration : ${i}")
    }

    //2's table
    val number = 2
    for (i in 1..10){
        //String Templating
        println("${number} * ${i} = ${number * i}")
    }

}