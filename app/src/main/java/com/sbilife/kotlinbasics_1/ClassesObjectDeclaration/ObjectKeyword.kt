import SharingWidget.incrementTwitterLikes
import android.graphics.drawable.Drawable

fun main() {

    //object keyword
    //Class and its single Object is created at once.
    //no constructors are allowed (init blocks are not allowed)
    //SingleTon pattern - creates single object throwout the project
    //You can inherit Class/Interface

    println("${objA.num}")
    println("${objB.test()}")

    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementFBLikes()
    SharingWidget.display()

    //Object Expression
    //Anonymous Objects using object keyword
    //Replacement of Java's Anonymous inner class
    var objTest = object{
        var a=10
        fun goto(){
            println("$a")
        }
    }
    objTest.goto()

    var objTestA = object : PersonA("Rajan Test") {
        var a=20
        fun goto(){
            println("$name")
        }
    }
    objTestA.clone()
    objTestA.goto()
}

interface ClonableObject {
    fun clone(){
    }
}

open class PersonA(val name: String) : ClonableObject {
    override fun clone() {
        super.clone()
        println("personal A")
    }
}

//SingleTon Pattern example
object SharingWidget{
    private var twitterLike = 0
    private var fblikes = 10

    fun incrementTwitterLikes() = twitterLike++

    fun incrementFBLikes() = fblikes++

    fun display() = println("FaceBook - $fblikes -- Twitter - $twitterLike")
}

object objA: Shape(), Dragables {
    val num: Int = 10
    override fun drag() {
        println("${num} is dragging")
    }
}

object objB{
    val p:Int = 20

    fun test(){
        println("$p")
    }
}