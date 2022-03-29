fun main() {
    //to define set of behaviours we use Interface
    //interface is by default abstract class
    //multiple interfaces can be implemented by classes
    //Abstract classes ar work with Types and Interfaces are work with behaviours
    //interface can have both abstract and concrete methods
    dragObjects(arrayOf(CircleA(5.0), SquareA(4.5), TriangleA(5.0, 6.0),
        Players("Rajan")))

    val mCircleA = CircleA(5.0)
    val mPlayerA = Players("rajan")

    //smart cassting to Dragables
    var arr = arrayOf(mCircleA, mPlayerA)
    for (obj in arr){
        //type checking by 'is' operator
        if (obj is CircleA){
            println("${obj.area()} Circle object")
        } else {
            //type casting using 'as' operator
            println("${(obj as Players).name}")
        }
    }
}

fun dragObjects(mObjects: Array<Dragables>){
    for (obj in mObjects) {
        obj.drag()
        obj.clone()
    }
}

interface Dragables {
    fun drag()
    fun clone() = println("clonable")
}

abstract class ShapeA :Dragables{
    abstract fun area(): Double
}

class CircleA(val radius: Double) : ShapeA() {
    override fun area(): Double = Math.PI * (radius * radius)
    override fun drag() = println("Circle is dragging..")
}

class SquareA(val side: Double) : ShapeA() {
    override fun area(): Double = side * side
    override fun drag() = println("Sqaure is dragging..")
}

class TriangleA(val base: Double, val height: Double) : ShapeA() {
    override fun area(): Double = 0.5 * base * height

    override fun drag() = println("Triangle is dragging..")
}

class Players(val name:String): Dragables{
    override fun drag()  = println("$name dragging")
}