import objB.p

fun main() {
    //Data classes used to store data only
    //Data classes by default overrides 'Any' Class methods like - toString(), hashCode(), equals()
    val p1 = PersonData(1, "RAJAN")
    val p2 = PersonData(1, "RAJAN")

    println(p1)//in background toString()
    println(p2)
    println(p1.hashCode())
    println(p1 == p2)//p1.equals(p2)

    //copy() function of data classes to
    val p3 = p1.copy(id = 2)
    println(p3)

    //destructing
    val (id, name) = p2
    println(id)
    println(name)
    //kotlin creates component n functions by default because of having 2 properties
    println(p2.component1()) // for id
    println(p2.component2()) // for name
}

//NOTE: while creating data classes min one property should be thier
data class PersonData(val id:Int, val name: String){

}