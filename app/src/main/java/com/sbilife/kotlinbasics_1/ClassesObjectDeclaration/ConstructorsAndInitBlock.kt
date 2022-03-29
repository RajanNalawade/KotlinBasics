fun main() {

    val person1 = Person("A", 20)
    println(person1.name)
    println(person1.age)
    val person2 = Person(26)
    println(person2.name)
    println(person2.age)

    val auto1 = Automobile("Maruti", true)
    println(auto1.name)
    println(auto1.airBags)
    auto1.airBags = false
    println(auto1.airBags)
}

class Automobile(val name:String, hasAirBags:Boolean){ //1st is Property and 2nd one is only parameter
    var airBags: Boolean = hasAirBags

    //initiliser block (init) - 1. after creating any object init block is called
    //2. class can have multiple init blocks which executes sequential order after object creation
    init {
        println("$name car created")
    }

    init {
        println("car driving..")
    }

    init {
        println("$name car has Airbags $airBags")
    }
}

class Person(val name:String, paramAge:Int){//Parameters
    var age: Int = paramAge // properties

    //Secodary constructor
    //when you define Secodary constructor firstly you have to call primary constructor of class

    constructor(paramAge: Int) : this("person1", paramAge)
}