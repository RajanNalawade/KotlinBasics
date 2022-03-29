import com.sbilife.kotlinbasics_1.inheritance_basics.SmartPhone

fun main() {
    //Inheritance -> is a relationship
    //car is a vehicle , truck is a vehicle
    //to use Inheritance in Kotlin super class must be 'open'
    //can not inherit from multiple classes
    //Parent class constructor is called before child class constructor
    //method and property overidding done by 'open' keyword
    //every Kotlin class has 'Any' as a superclass
    val objChild = Child()
    objChild.myFun()
    objChild.myFun2()

    val iqoo7 = SmartPhone("Smart Phone")
    println("${iqoo7.name} - ${iqoo7.size} - type is ${iqoo7.type}")
    iqoo7.display()
    iqoo7.makeCall()
}

open class Parent{
    val surName:String = ""
    init {
        println("Parent Init block called")
    }

    fun myFun() {
        println("Im in Parent")
    }
}

class Child :Parent(){
    val name : String = ""

    init {
        println("child Init block called")
    }

    fun myFun2() {
        println("Im in child")
    }
}