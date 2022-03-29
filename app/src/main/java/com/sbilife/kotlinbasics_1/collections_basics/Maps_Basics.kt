fun main() {
    //Map - simple Key Value Pair
    //map do not allow duplicate keys
    //Muttable Map - can change the map
    //Immutable Map - can not change the map
    val students = mutableMapOf<Int, String>()
    students.put(1, "name1")
    students.put(2, "name2")
    students.put(3, "name3")
    students.put(4, "name4")

    println(students.get(3))
    println(students.get(11)) // returns null

    for ((key, value) in students){
        println("$key = $value")
    }

    students[8] = "Rajan"
    println(students[8])

    //Immutable maps with its initialization
    val list1 = mapOf(1 to "kop", 2 to "sangli", 4 to "lehm", 5 to "ukren")
    println(list1)
    println(list1[3])// returns null
}