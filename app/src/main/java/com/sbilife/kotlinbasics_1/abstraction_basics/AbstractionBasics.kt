fun main() {
    //abstract means entity which is not defined, and they are defined by their child classes
    //abstract method -> NO body only method declaration
    //any class contain abstract method or property, that class should be declared as abstract
    //by default all abstract methods,classes are open
    //we can not create instance of an abstract class

    val mTiger: Tiger = Tiger("Tiger")
    mTiger.animalSound()
}

abstract class Animal(var name: String) {
    abstract fun animalSound()
    abstract fun isWild(): Boolean
}

class Tiger(paramName: String) : Animal(paramName) {
    override fun animalSound() {
        println("$name rore.....")
    }

    override fun isWild(): Boolean = true
}