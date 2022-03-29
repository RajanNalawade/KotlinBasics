fun main() {
    //non nullable data types can not accpet null values
    val name1: String = "rajan"
    //?(nullable) can accept null values
    val name: String? = null
    val isAdult: Boolean? = null

    //null checking
    if (name != null){
        println(name.uppercase())
    }

    //null safe operator for single statement
    println(name?.uppercase())

    //null safe operator for multiple statements
    //let can be use with nullable and non-nullable properties
    name?.let {
        println(it.uppercase())
        println("name is $name")
    }

    name1.let {
        println("name is $name1")
        println("${it.lowercase()}")
    }

    //Elvis operator(?:) like turnary operator java
    //if name is null elvis operator(?:) returns "" else return name
    var seletedValue = name ?: ""

    //not null asserted operator (!!)
    //not null asserted operator (!!) executes function even name is null
    // throws error if name is null
    try {
        var value = name!!.uppercase()
    }catch (e: Exception){
        e.printStackTrace()
    }

}