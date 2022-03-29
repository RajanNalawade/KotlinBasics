fun main() {
    //Nested class - Class containing subclasses
    //classes that have no existence, are used with outer class
    //Can not access members of Outer class
    val obj = Outer()
    println("${obj.i}")
    val nested = Outer.Nested()
    nested.test()

    //so to access members of Outer class just use keyword 'inner'
    //Inner class that runs in context of Outer class
    //we can not call inner class constructor directly, like Nested class
    //val mInner = obj.InnerClass()
    val mInner = Outer().InnerClass()
    mInner.test()

    //This concept is used in RecyclerView

}

class Outer{
    var i = 0;
    class Nested(){
        fun test(){
            println("I'm in Nested Class")
        }
    }

    inner class InnerClass(){
        fun test(){
            println("I'm in Inner Class with value $i")
        }
    }
}