fun main() {

    //when user not define any constructor kotlin automatically adds default constructor
    //default constructo has no parameter
    val cal = Calculator()//default constructor
    println(cal.addition(3, 5))
    println(cal.multiply(3, 5))

    //Getter Setters
    val p1 = PersonGetSet("rajan", 34)
    println(p1.age)
    p1.age = 30
    println(p1.age)
    p1.age = -20
    println(p1.name)


}

class Calculator{
    //In Kotlin property must be initialised to avoid runtime error
    var msg:String = ""
    //to avoid initialization at property defination use lateinit keyword
    //lateinit is used only with var type and can use only String and Number data type
    lateinit var msg1:String

    fun addition(a: Int, b: Int):Int = a + b

    fun multiply(a: Int, b: Int):Int = a * b
}

class PersonGetSet(paramName:String, paramAge: Int){
    val name:String = paramName
    get() {
        return field.uppercase()
    }

    var age:Int = paramAge
        //set validation using setters
    set(value) {
        if (value>0) {
            field=value // default variable to use 'field'
        }else{
            println("age can not be Negative")
        }
    }
    get() {
        return field
    }

    //by default getter and setter
    var email:String = ""
    get() = field
    set(value) {
        field = value
    }
}