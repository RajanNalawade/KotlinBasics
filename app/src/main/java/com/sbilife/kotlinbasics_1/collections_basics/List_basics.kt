fun main() {

    //Mutable List - can be changed i.e. elements can be added/removed/replaced
    //Immutable List - can't be changed , mostly used in multi threaded apps
    //listof() is by default immutable list
    var listA = mutableListOf(1,2,3,4)
    var list2 = listOf(11,13)

    var listB = listOf(0,9,8,7,6)

    listA.set(2, 0)
    listA.add(8)
    listA.addAll(list2)

    println(listA)
    println(list2)

    println(listB)
    println(listB.indexOf(6))

}