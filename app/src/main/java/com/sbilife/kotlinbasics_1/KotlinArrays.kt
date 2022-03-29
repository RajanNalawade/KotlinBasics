fun main() {

    //Arrays -> object that stores multiple values of same data type
    //fixed size
    /*syntax
    var arr = arrayOf("1","2","3")*/

    var arr = arrayOf("1","2","3")
    var arr1 = arrayOf(1,2,3)
    for (i in arr){
        println(i)
    }

    //use index of arrays
    for ((i,e) in arr.withIndex()){
        println("index is ${i} with value ${e}")
    }

    //arrays get and set methods
    println(arr[0])
    println(arr.get(1))
    arr.set(2,"4")
    println(arr.get(2))
}