fun main() {
    //by default kotlin uses 'public' modifier
    //A. Modifier | top level declaration | Class Members
    //public      | Everywhere            | Everywhere
    //internal    | with in a module      | with in a module
    //private     | with in file          | with in Class
    //protected   | not applicable        | Subclasses

    val objA = A()
    val objB = B()

    objB.test()
}

//top level declarations
open class A{
    public var a:Int = 10
    internal var b:Int = 20
    private var c:Int = 30
    protected var d:Int = 40
}

class B: A() {
    fun test() {
        println(a)
        println(b)
        //cant access outside the class
        //println(c)
        //can access by Subclasses
        println(d)
    }
}

//top level declarations
var b = 40

//top level declarations
public fun goTo(name: String){
    println("its $name class")
}