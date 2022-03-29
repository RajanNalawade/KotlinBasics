fun main() {
    /*Class - 1. its a blueprint/template having well define structure and property
                2. User defined data type by which we save complex data */
    /*Objects - real world entity*/
    val marutiCar = Car("Maruti", "CNG", 340)
    val tataCar = Car("TATA", "EV", 340)

    println("Car name is ${marutiCar.name}")
    println("Car name is ${tataCar.name}")

    marutiCar.driveCar()
    marutiCar.applyBreaks()

    tataCar.driveCar()
    tataCar.applyBreaks()

    var i : Int = 20
    println(i.plus(30))
    println(i.toFloat())
}

class Car(val name:String, val type: String, var kmRan: Int){//Properties

    //functions or Methods
    fun driveCar(){
        println("$name Car is driving...")
    }

    //functions or Methods
    fun applyBreaks(){
        println("applied breaks...")
    }
}

