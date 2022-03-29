fun main() {

    val tile: Tile = Blue(5)
    val points: Int = when (tile){
        is Red -> tile.points * 2
        is Blue -> tile.points * 5
        else -> {0}
    }
    println(points)
}

//Sealed Classes
//enum has only one object with same state, Sealed has multiple types so have multiple objects with different state
//enum is values based , Sealed is type based
//In sealed class others classes must be in the same page
//can not create sealed class object its an abstract class
sealed class Tile
class Red(val type:String, val points: Int): Tile()
class Blue(val points: Int): Tile()

