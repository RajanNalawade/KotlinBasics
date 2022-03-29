fun main() {
    //Scope functions are utility functions and are commonly used
    //apply, let, with, run
    val emp = Employee()
    emp.name = "John"
    emp.age = 20

    //apply points to current object which returns same current object
    var x = emp.apply{
        name = "sena"
        age = 30 // no need to write emp.age or emp.name
    }
    println(x)

    //let we can perform multiple operations on the same object
    //it can be used on nullable and not-nullable objects
    //returns last statement of block
    var y = x.let {
        println(it.age)
        println(it.name)
        "hello"
    }

    var strAge: String? = null
    val lenght = strAge?.let {
        println(it.toString())
        it.length
    }

    //With is same as apply(), have to pass object
    //returns last statement of block
    with(emp){
        age = 45
        name = "with name"
    }
    println(emp)

    //combination of let and with functions
    //returns last statement of block
    emp.run {
        age = 40
        name = "combination"
    }
    println(emp)

}

data class Employee(var name: String = "", var age: Int = 18)