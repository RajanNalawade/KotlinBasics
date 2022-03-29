fun main() {
    //Poly means many and Morph means form
    // one function/method with many forms
    //

    val mCircle: ShapeA = CircleA(5.0)
    val mSquare: ShapeA = SquareA(4.0)

    val mShapes:Array<ShapeA> = arrayOf(mCircle, mSquare, TriangleA(5.0,3.0))
    calculateAreas(mShapes)
}

fun calculateAreas(shapes: Array<ShapeA>) {
    for(shape in shapes){
        println(shape.area())
    }
}

open class Shape {
    open fun area(): Double {
        return 0.0;
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * (radius * radius)
    }
}

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return (side * side)
    }
}

class Triangle(val base:Double, val height: Double): Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}