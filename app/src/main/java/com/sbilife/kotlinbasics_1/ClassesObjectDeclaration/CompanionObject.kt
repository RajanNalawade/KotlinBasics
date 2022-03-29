import android.os.Build.VERSION_CODES.P

fun main() {
    //Companion means friend
    //MyClass having companion myObj object - so that MyClass can access all its methods
    // and properties without its permission.
    //Any Class can have only one companion class
    MyClass.foo()
    MyClass.myAnotherObj.too()

    //Kotlin doesn't have static keyword like java, to overcome this companion key word is used
    //Kotlin and java are interoperable with each other
    //In this foo() iis not static method in the background it is called by making an object instance
    //so to call companion object property or methods from java class use @JvmStatic

    //In Kotlin we use companion keyword in Factory Pattern
    //Factory Pattern is nothing but object of factory
    //Example of Factory Pattern using companion
    var pizza1:Pizza =Pizza.Factory.create("Peppy Panner")
    println(pizza1)

    //Here i am calling via Factory reference - dont want to use factory reference
    //Now define that as companion
    var pizza2: Pizza = Pizza.create("")
    println(pizza2)

    //one more thing we can do - we want everyone to call this create method if they want pizza
    //for that we will mark the constructor as private
    //var pizza3 = Pizza()
    //Now Everyone need to call create method i.e. everyone has to call its factory
}

class Pizza private constructor(val type:String, val topping: String){
    companion object Factory{ //this is factory object
        fun create(pizzaType:String): Pizza {
            return when (pizzaType) {
                "Tomato" -> Pizza("Tomato", "Tomato, Cheese")
                "Peppy Panner" -> Pizza("Panner Farm", "Panner, Cheese Burst, Tomato, Onion")
                else -> Pizza("Basic", "Onion, Cheese")
            }
        }
    }

    override fun toString(): String {
        return "Pizza (type='$type', topping='$topping')"
    }
}

class MyClass{

    companion object myObj{
        //@JvmStatic treats this method as static for java
        @JvmStatic
        fun foo() {
            println("in foo fun of myOBJ")
        }
    }

    object myAnotherObj{
        fun too() {
            println("in too fun of myAnotherObj")
        }
    }
}